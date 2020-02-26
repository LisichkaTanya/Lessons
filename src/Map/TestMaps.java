package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMaps {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); //нет никакого порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //сохраняет порядок добавления
        Map<Integer, String> treeMap = new TreeMap<>(); // сортируется по ключу (естественный порядок)

        testMap(hashMap);
        System.out.println();
        testMap(linkedHashMap);
        System.out.println();
        testMap(treeMap);
    }
    public static void testMap (Map<Integer, String> map){
        map.put(12, "Bob");
        map.put(59, "Tom");
        map.put(33, "Mike");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " : " +entry.getValue());
        }
    }
}
