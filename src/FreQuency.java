import java.util.HashMap;
import java.util.List;
import java.util.Map;

//count the frequency of element in i list

public class FreQuency {
    public static void main(String[] args) {
        List<String> str = List.of("apple","apple","banana","cherry","banana");
        Map<String,Integer> FrequescyMap = new HashMap<>();
        for (String element : str) {
            if (FrequescyMap.containsKey(element)){
                FrequescyMap.put(element,FrequescyMap.get(element)+1);
            }else {
                FrequescyMap.put(element,1);
            }

        }
        System.out.println(FrequescyMap);
    }
}
