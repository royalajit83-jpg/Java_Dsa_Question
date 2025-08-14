public class Compress {
    public static void main(String[] args) {
        String s = "aaabcccdd";
        String result = CompressSt(s);
        System.out.println(result);
    }

    public static String CompressSt(String s){
        StringBuilder str = new StringBuilder();
        char ch = s.charAt(0);
        int count = 0;

        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i)==ch){
                count++;
              }else {
                str.append(ch);
                if (count>1) {
                    str.append(count);
                    count = 1;
                }

                ch=s.charAt(i);
              }

            if (i==s.length()-1){
                ch=s.charAt(i);
                str.append(ch);
                if (count>1) {
                    str.append(count);
                    count = 1;
                }
            }

        }

        return str.toString();

    }
}
