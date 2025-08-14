package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("apple",10);
        map.put("banana",20);
        map.put("cherry",30);
        System.out.println(map);
        map.get("banana");
        System.out.println(map);
        map.remove("cherry");
        System.out.println(map);
    }
}
