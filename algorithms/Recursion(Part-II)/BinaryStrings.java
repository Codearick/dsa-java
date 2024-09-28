public class BinaryStrings {
    public static void main(String[] args) {
        binaryString(3, 0, " ");
    }

    public static void binaryString(int n, int lastPlace, String binString){
        if(n == 0){
            System.out.println(binString);
            return;
        } 

        //Kaam
        binaryString(n - 1, 0, binString+"0");

        if(lastPlace == 0){
            binString += "1";
            lastPlace = 1;
            binaryString(n - 1, lastPlace, binString);
        }
    }
}
         