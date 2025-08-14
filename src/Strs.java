import java.util.HashSet;
import java.util.Set;

public class Strs {
    public static void main(String[] args) {
        String strs = "aannuubbhhav";
        String result = String.valueOf(RemoveDuplicatess(strs));
        System.out.println(result);
    }
    public static StringBuilder RemoveDuplicatess(String strs){
        Set<Character> sets = new HashSet<>();
        StringBuilder cleanString = new StringBuilder();

        for (int i = 0; i < strs.length(); i++) {
            char c = strs.charAt(i);
            if (!sets.contains(c)){
                sets.add(c);
                cleanString.append(c);
            }

        }
        return cleanString;
    }
}
