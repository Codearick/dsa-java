public class Hybrid {
    public static void main(String[] args) {
        Pitbull tommy = new Pitbull("Tommy", "Yellow");
        tommy.extraFeatures(tommy, "Hard", "Heavy");
    }
}

class Pitbull extends Mammal{
    String color;
    Pitbull(String name, String color){
        super(name, "warm");
        this.color = color;
    }

    void extraFeatures(Pitbull name, String bark, String weight){
        System.out.println("I'm " + name.name);
        System.out.println("I'm " + this.color + "in color");
        System.out.println("I'm " + weight);
        System.out.println("I bark " + bark);
    }
}
