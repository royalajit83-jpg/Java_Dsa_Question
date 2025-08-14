class Solution {
    public static void main(String[] args) {
        int x = 1534236469;
        int result = reverse(x);
        System.out.println(result);
    }
    public static int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int lastDigit = x%10;
            rev = rev *10 + lastDigit;
            x/=10;
        }

        return rev;
    }
}