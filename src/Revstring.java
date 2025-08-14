public class Revstring {
    public static void main(String[] args) {
        String str = "anubhav";
        String reverseString = String.valueOf(Ispl(str));
//        if (reverseString.equals(str)){
//            System.out.println("yes String is palindrome ");
//        }else System.out.println("string is not a palindrom");
        System.out.println(reverseString);
    }

    public static StringBuilder Ispl(String str) {
      StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
         }
          return rev;

    }
}

