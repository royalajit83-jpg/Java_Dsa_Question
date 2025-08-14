package in.kgcoding;

public class CompressString {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        String result = Counts(str);
        System.out.println(result);
    }
    public static String Counts(String str){
        String newSt = "";
        char c = str.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)){
                count++;
            }else {
                newSt+=c;// newST = newST + c
                if (count>1) {
                    newSt += count;
                    count = 1;
                }

                c = str.charAt(i);
            }

            if (i == str.length()-1){
                c = str.charAt(i);
                newSt+=c;
                if (count>1) {
                    newSt += count;
                    count = 1;
                }
            }

        }

        return newSt;
    }
}
