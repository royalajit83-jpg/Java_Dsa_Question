package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        if (map.containsValue(2)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }
}
