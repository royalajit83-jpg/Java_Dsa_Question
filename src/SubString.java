public class SubString {
    public static void main(String[] args) {
        String str = "abcabcbac";
        String newStr= "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                char Istr = str.charAt(i);
                char Jstr = str.charAt(j);
                if (Istr!=Jstr){
                    newStr+=str;
                }
            }

        }
        System.out.println(newStr);
    }
}
