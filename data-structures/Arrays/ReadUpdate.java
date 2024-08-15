import java.util.Scanner;

public class ReadUpdate {
    public static void main(String[] args) {
        int [] marks = new int[10];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks: ");

        marks[0] = scan.nextInt();
        marks[1]= scan.nextInt();
        marks[2] = scan.nextInt();
        
        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Biology: "+ marks[2]);

        marks[2] = marks[2] + 1;
        System.out.println("Updated Bio Marks: "+ marks[2]);

        scan.close();
    }
    
}
