import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,4,4,1,1,5,3,3};
        Set<Integer> result = FindDuplicates(arr);
        System.out.println(result);
    }

    public static Set<Integer> FindDuplicates(int[] arr){
        Set<Integer> set = new HashSet<>();
        Set<Integer> sets = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])){
                sets.add(arr[i]);
            }

        }
//        for (int element : arr) {
//            if (!set.add(element)){
//                sets.add(element);
//            }
//
//        }

        return sets;

    }
}
