import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "anubhav";
        String result = RemoveDuplicate(str);
        System.out.println("new Srtring is : " + result);
    }
    public static String RemoveDuplicate(String str){
        Set<Character> strs = new HashSet<>();
        StringBuilder st = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!strs.contains(c)){
                strs.add(c);
                st.append(c);

            }

        }
       return st.toString();
    }
}

