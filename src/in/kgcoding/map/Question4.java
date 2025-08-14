package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;

public class Question4 {
    public static void main(String[] args) {
        String str = "apple banana apple cherry banana apple";
        String[] input = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (String s : input) {
            if (map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else map.put(s,1);
        }
        System.out.println("count : " + map );

    }
}


