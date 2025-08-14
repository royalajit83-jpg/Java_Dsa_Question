import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,6,7,8,7};
        System.out.println("enter a number : ");
        int num = inp.nextInt();
        int occ = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
               occ++;
            }
        }
        System.out.println(occ);
    }
}
