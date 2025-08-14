package in.kgcoding.Oops;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,7,7};
        int occ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    occ++;
                    System.out.println(arr[i]);
                }
            }

        }
        System.out.println("element found " + occ + " times");
    }
}
