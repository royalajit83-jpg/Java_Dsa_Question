import java.util.Arrays;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {4,4,4,8,6,1,4,2,3};
        int[] newArr = Arrays.stream(arr).sorted().distinct().toArray();
        System.out.println(Arrays.toString(newArr));

    }
}
