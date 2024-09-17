package AccessModifier;
public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myacc = new BankAccount();
        myacc.setName("Rohan Gautam");
        System.out.println("Getter got it " + myacc.getName());
        // myacc.password = "rohan is don";//this cannot be accessed as password is private

    }
    
}
class BankAccount{
    private String name;
    private String password;

    String getPassword(){ // getters
        return this.password;
    }

    void setPassword(String pwd){ //setters
        this.password = pwd;
    }
    String getName(){ // getters
        return this.name;
    }
    void setName(String name){ // setters
        this.name = name;
    }

}