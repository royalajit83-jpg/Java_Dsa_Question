public class ArmStrom {
    public static void main(String[] args) {
        int num = 153;
        int rev = 0 ;
        while (num!=0){
            int lastDigit = num%10;
            rev = rev + lastDigit ;
            num/=10;

        }
        System.out.print(rev);

    }
}
