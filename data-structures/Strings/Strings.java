public class Strings{
    public static void main(String[] args) {
        char [] string = {'a', 'b', 'c', 'd', 'e'};
        String string2 = "abcde";
        String string3 = new String("abcde");

        //Strings are IMMUTABlE

        //Strings can be compared in three ways: 
        System.out.println(string2 == string3); // by using == operator
        System.out.println(string.equals(string3)); // by using equals method.
        System.out.println(string2.compareTo(string3)); // by using compareTo method which returns integers.

        //Strings can be concatenated by three ways: 
        System.out.println(string2 + string3); //by using + operator.
        System.out.println(string2.concat(string3)); // by using concat method.

        //charAt method.
        System.out.println("Char at 3 is: "+string2.charAt(3));

        
    }
}