import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a number : ");
        int input = inp.nextInt();
        int sum = 0;
        while(input!=0){
            sum+=input %10;
            input/=10;
        }

        System.out.println(sum);
    }

}
