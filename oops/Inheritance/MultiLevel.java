public class MultiLevel {
    public static void main(String[] args) {
        Dog pitbull = new Dog();

        pitbull.eat();

        pitbull.legs = 4;
        System.out.println("This dog has " + pitbull.legs + " legs");
    }
}



class Dog extends Mammal {
    String breed;
}
