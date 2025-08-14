public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        boolean result = isPalindrome(x);
        if (!result) {
            System.out.println("No, This number is not a palindrome number ");
        } else {
            System.out.println("Yes, This number is a palindrome");
        }
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int rev = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x /= 10;
        }

        return original == rev;
    }
}