public class LastLengths {
    public static void main(String[] args) {
       String s = "luffy is still joyboy";
        int result = lengthOfLastWord(s);
        System.out.println(result);

    }
    public static int lengthOfLastWord(String s) {
        int count = 0;
        String st = s.trim();
        for (int i = s.length()-1; i >0 ; i--) {
            if (st.charAt(i)==' '){
                break;
            }else count++;

        }

        return count;
    }
}
