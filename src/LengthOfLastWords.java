class LengthOfLastWords {
    public static void main(String[] args){
        String s = "hello how are you anubhav";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }

    public static int lengthOfLastWord(String str) {
       int count = 0;
       String st = str.trim();
        for (int i = st.length()-1; i >=0 ; i--) {
            if (st.charAt(i) == ' ') {
                break;
            }else count++;
        }

        return count;
    }
}