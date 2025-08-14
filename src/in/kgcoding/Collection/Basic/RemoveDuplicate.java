package in.kgcoding.Collection.Basic;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 2, 2, 2, 5, 6, 7, 7, 7, 7);
        List<Integer> list2 = new ArrayList<>();
        for (Integer element : list) {
            if (!list2.contains(element)){
                list2.add(element);
            }

        }
        System.out.println(list2);
    }
}
