package n05_data_structures;

import java.io.File;
import java.net.URISyntaxException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
//        a();
//        b();
//        c();
//        d();
        e();
    }

    private static void a() {
        CinemaHall cinemaHall = new CinemaHall("H1", 1) {{
            reserve(26);
            reserve(3, 5);
        }};
        System.out.println(cinemaHall);
    }

    private static void b() {
        List<String> names = new ArrayList<>() {{
            add("Harry");
            add("Terence");
            add("Hayes");
            add("Jaiden");
            add("Zoe");
            add("Bertha");
        }};

        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.get(5));

        names.add(5, "Samantha");

        names.sort(String::compareTo);
        System.out.println(names);
    }

    private static void c() {
        Map<String, String> itAbbreviations = new HashMap<>() {{
            put("CPU", "Central Processing Unit");
            put("RAM", "Random Access Memory");
            put("GPU", "Graphics Processing Unit");
            put("API", "Application Programming Interface");
            put("HTML", "Hypertext Markup Language");
            put("CSS", "Cascading Style Sheets");
            put("DNS", "Domain Name System");
        }};

        itAbbreviations.put("RAM", "Random Access Memory (again)");

        itAbbreviations.remove("CPU");

        System.out.println("API exists: " + (itAbbreviations.containsKey("API") ? "Yes" : "No"));

        itAbbreviations.put("RAM", "Random Access Memory (again) (again)");

        System.out.println(itAbbreviations);
    }

    private static void d() {
        CustomFIFOQueue<Map.Entry<Integer, String>> orders = new CustomFIFOQueue<>() {{
            add(Map.entry(111, "Pizza"));
            add(Map.entry(232, "Hotdog"));
            add(Map.entry(499, "BigMac"));
            add(Map.entry(555, "Donut"));
        }};
        System.out.println("First: " + orders.remove());
        StringJoiner sj = new StringJoiner(" | ");
        for (Map.Entry<Integer, String> entry : orders) {
            sj.add(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(sj);
    }

    private static void e() throws URISyntaxException {
        File outDirectory = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile();
        CustomTreeNode<String> tree = new CustomTreeNode<>(outDirectory.getAbsolutePath());
        Main.readFilesystemToTreeRecursive(tree, outDirectory);
        System.out.println(tree);
    }

    private static void readFilesystemToTreeRecursive(CustomTreeNode<String> tree, File folder) {
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException(folder.getAbsolutePath() + " is not a directory");
        }

        File[] files = folder.listFiles();
        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                tree.addChild(file.getName());
            } else if (file.isDirectory()) {
                Main.readFilesystemToTreeRecursive(tree.addChild(file.getName()), file);
            }
        }
    }
}
