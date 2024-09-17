public class SingleLevel {
    public static void main(String[] args) {
        Mammal dog = new Mammal("Dog", "Warm");
        dog.features(dog);
    }
}

class Mammal extends Animal{
    String bloodType;
    int legs;
    
    Mammal(String name, String bloodType){
        super(name);
        this.bloodType = bloodType;
    }
    void features(Mammal s1){
        System.out.println("Hi, I am " + s1.name + " and I am " + s1.bloodType + " blooded.");
    }
}

class Aves extends Animal{
    Aves(String name){
        super(name);
    }
    void fly(){
        System.out.println("Aves fly...");
    }
}