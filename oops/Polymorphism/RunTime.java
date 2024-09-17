

public class RunTime {
    public static void main(String[] args) {
        Deer golden = new Deer();
        golden.eat();   
    }
}
class Animal{
    void eat(){
        System.out.println("Eat everything...");
    }
}

class Deer extends Animal{

    //Method overriding or Runtime polymorphism.
    void eat(){
        System.out.println("Deer only eats grass..");
    }
}
