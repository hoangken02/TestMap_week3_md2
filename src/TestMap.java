import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("no1", 1);
        hashmap.put("no2", 2);
        hashmap.put("no3", 3);
        hashmap.put("no4", 4);
        System.out.println("HashMap:");
        System.out.println(hashmap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap = hashmap;
        System.out.println("TreeMap:");
        System.out.println(+ treeMap.get("no6"));

        Map<String, Integer> linkHashMap = new LinkedHashMap<>();
        linkHashMap = treeMap;
        System.out.println("\nThe age for " + "Lewis is " + linkHashMap.get("no1"));
    }
}
