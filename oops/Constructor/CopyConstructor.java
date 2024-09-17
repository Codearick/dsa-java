package Constructor;
public class CopyConstructor {
    public static void main(String[] args) {
        BankAccount c1 = new BankAccount();
        c1.name = "Rohan Gautam";
        c1.age = 20;
        c1.password = "Rohan is a don";
        c1.phone[0] = 123232;
        c1.phone[1] = 379487;
        c1.phone[2] = 568768;

        BankAccount c2 = new BankAccount(c1);
        c2.password = "Rohan is again a don!";

        c1.phone[2] = 100;

        for (int i = 0; i < c2.phone.length; i++) {
            System.out.println("Phone numbers are: " +c2.phone[i]);
        }

    }
    
}
class BankAccount{
    String name;
    String password;
    int age;
    int [] phone;

    BankAccount(){
        phone = new int [3];
        System.out.println("Constructor is called ....!");
    }

    //shallow copy constructor
    // BankAccount(BankAccount c1){
    //     phone = new int [3];
    //     this.name = c1.name;
    //     this.age = c1.age;
    //     this.phone = c1.phone;
    // }

    //deep copy constructor 
    BankAccount(BankAccount c1){
        phone = new int [3];
        this.name = c1.name;
        this.age = c1.age;
        for (int i = 0; i < phone.length; i++) {
            this.phone[i] = c1.phone[i];
        }
    }
}