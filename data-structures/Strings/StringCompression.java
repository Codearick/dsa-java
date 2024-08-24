public class StringCompression {
    public static void toCompress(String str){
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while(i < str.length() - 1  && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }

            if(count > 1){
                result.append(str.charAt(i) + count.toString());
            } else{
                result.append(str.charAt(i));
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str = "aaaabbbdd";
        toCompress(str);
        // System.out.println(false + " " + true);
    }
}
