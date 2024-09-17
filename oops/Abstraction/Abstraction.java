public class Abstraction {
    public static void main(String[] args) {
        // Horse horse = new Horse();
        // horse.eat();
        // horse.walk();
        // horse.changeColor();
        // System.out.println("The color of the horse is: " +horse.color);
        // System.out.println();

        // Chicken broiler = new Chicken();
        // broiler.eat();
        // broiler.walk();
        // broiler.changeColor();
        // System.out.println("The color of the chicken is: " + broiler.color);
        // System.out.println();

        Mustang badal = new Mustang();
        // Animal -> Horse -> Mustang
    }
}

abstract class Animal{
    String color; 
    
    Animal(){
        System.out.println("Animal constructor called...!");
        color = "brown";
    }
    void eat(){
        System.out.println("Animal eats...");
    }

    abstract void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called...!");
    }

    void changeColor(){
        color = "White";
    }
    void walk(){
        System.out.println("Walks on four legs....");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called...!");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "Red";
    }
    void walk(){
        System.out.println("Walks on two legs....");
    }
}
