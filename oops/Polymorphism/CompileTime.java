public class CompileTime {
    public static void main(String[] args) {
        Calculator add = new  Calculator();

        System.out.println(add.sum(1,2));
        System.out.println(add.sum(1.2f, 1.3f));
        System.out.println(add.sum(2,3,5));

    }
}

class Calculator{
    //Method overloading or CompileTime polymorphism.
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}
