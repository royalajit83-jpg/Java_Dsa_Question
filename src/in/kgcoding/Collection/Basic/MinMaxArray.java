package in.kgcoding.Collection.Basic;

import java.util.Arrays;
import java.util.List;

// find minimum and maximum in array list
public class MinMaxArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,6,3,9,4);
        int resultForMax = Maximum(list);
        System.out.println(resultForMax);
        int resultFormin = Minimum(list);
        System.out.println(resultFormin);

    }

    public static int Maximum(List<Integer> list){
        int max= list.getFirst();
        for (int i = 0; i < list.size(); i++) {
            if (max<list.get(i)){
                max = list.get(i);
            }

        }
        return max;

    }

    public static int Minimum(List<Integer> list){
        int max= list.getFirst();
        for (int i = 0; i < list.size(); i++) {
            if (max>list.get(i)){
                max = list.get(i);
            }

        }
        return max;

    }

}
