public class Common_prefix {
    public static void main(String[] args) {
        String[] str = {"float","flower","flight","flow"};
        String result = prefix(str);
        System.out.println(result);
    }

    public static String prefix(String[] str){
        String prefix = str[0];
        for (int i = 1; i < str.length ; i++) {
            while (str[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
