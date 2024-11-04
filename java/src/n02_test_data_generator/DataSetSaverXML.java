package n02_test_data_generator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;

public class DataSetSaverXML implements DataSetSaver {
    @Override
    public void saveData(File file, List<Double> dataSet) {
        Document document;
        try {
            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }

        Element rootElement = document.createElement("dataSet");
        for (Double dataPoint : dataSet) {
            Element dataPointElement = document.createElement("dataPoint");
            dataPointElement.appendChild(document.createTextNode(dataPoint.toString()));
            rootElement.appendChild(dataPointElement);
        }
        document.appendChild(rootElement);

        Transformer transformer;
        try {
            transformer = TransformerFactory.newInstance().newTransformer();
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        }
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        StreamResult streamResult = new StreamResult(file);
        try {
            transformer.transform(new DOMSource(document), streamResult);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}
