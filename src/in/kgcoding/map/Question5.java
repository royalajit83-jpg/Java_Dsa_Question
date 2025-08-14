package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;

public class Question5 {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        System.out.println("map 1 is : " + map1);
        map2.put("B",3);
        map2.put("C",4);
        System.out.println("map 2 is : " + map2);
        map1.putAll(map2);
        System.out.println(map1);
    }
}
