package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;

public class Question2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("java",1);
        map.put("python",2);
        map.put("c++",3);
        String find = "c++";
        if (map.containsKey(find)){
            System.out.println(map.get(find));
        }else System.out.println("error");

    }

}
