package n07_file_types;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, URISyntaxException {
        convertSongCatalogXMLToCSV();
        saveMargaritJson();
    }

    private static void convertSongCatalogXMLToCSV() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("src/n07_file_types/catalog.xml");

        StringJoiner catalogLineJoiner = new StringJoiner("\n");
        NodeList nodes = document.getElementsByTagName("song");
        if (nodes.getLength() > 0) {
            NodeList firstNodeChildren = nodes.item(0).getChildNodes();
            StringJoiner columnNamesCommaJoiner = new StringJoiner(",");
            for (int i = 0; i < firstNodeChildren.getLength(); i++) {
                Node childNode = firstNodeChildren.item(i);
                if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                    columnNamesCommaJoiner.add(childNode.getNodeName());
                }
            }
            catalogLineJoiner.add(columnNamesCommaJoiner.toString());

            for (int i = 0; i < nodes.getLength(); i++) {
                NodeList childNodes = nodes.item(i).getChildNodes();
                StringJoiner songCommaJoiner = new StringJoiner(",");
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node childNode = childNodes.item(j);
                    if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                        songCommaJoiner.add(childNode.getTextContent());
                    }
                }
                catalogLineJoiner.add(songCommaJoiner.toString());
            }
        }
        Files.writeString(Path.of("src/n07_file_types/catalog.csv"), catalogLineJoiner.toString());
        System.out.println("Wrote catalog to catalog.csv");
    }

    public static void saveMargaritJson() throws IOException, URISyntaxException {
        URL url = new URI("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarit").toURL();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader responseBufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String responseJson = responseBufferedReader.lines().collect(Collectors.joining());
        Files.writeString(Path.of("src/n07_file_types/drinks.json"), responseJson);
        System.out.println("Wrote margarit to drinks.json");
    }
}
