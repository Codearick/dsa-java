
public class Inheritance {
    public static void main(String [] args) {
        Pisces shark = new Pisces("Shark");

        shark.eat(shark);
    }
}

//Base class
class Animal{
    String color; 
    String name;

    Animal(String name){
        this.name = name;
    }

    void eat(Animal s1){
        System.out.println(s1.name + " Eats...");
    }

    void breathe(){
        System.out.println("This Animal Breathes...");
    }
}

//Derived class
class Pisces extends Animal{
    int fins;

    Pisces(String name){
        super(name);
    }

    void swims(){
        System.out.println("Swims in water...");
    }
}