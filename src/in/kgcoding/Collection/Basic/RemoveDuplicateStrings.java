package in.kgcoding.Collection.Basic;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateStrings {
    public static void main(String[] args) {
        String str = "aaannuubbhhaavv";
        String result = String.valueOf(RemoveDup(str));
        System.out.println(result);
    }
    public static StringBuilder RemoveDup(String str){
        Set<Character> sets = new HashSet<>();
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!sets.contains(c)){
                sets.add(c);
                st.append(c);

            }

        }
        return st;
    }
}
