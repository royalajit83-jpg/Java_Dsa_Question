package in.kgcoding;

import java.util.ArrayList;
import java.util.List;

public class FindCommon {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(List.of(5,6,2,3,7));

       list1.retainAll(list2);
        System.out.println(list1);

    }
}
