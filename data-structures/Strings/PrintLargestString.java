public class PrintLargestString {
   public static String printLargest(String [] fruits){
    String largest = fruits[0];
    for(int i = 0; i < fruits.length; i++){
        if(largest.compareToIgnoreCase(fruits[i]) < 0){
            largest = fruits[i];
        }
    }
    return largest;
    }

    public static void main(String[] args) {
        String fruits [] = {"Apple", "Pear", "Orange", "Mango", "Litchi", "Guava", "Banana", "Coconut", "Pineapple"};
        System.out.println("The largest string among these are: " + printLargest(fruits));
    }
    
}
