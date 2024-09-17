package Encapsulation;
public class OOPS{
    public static void main(String [] args){
        Pen ball = new Pen();
        ball.setColor("Black");
        ball.setNewTip(1);
        System.out.println(ball.color + " " + ball.tip);
    }
}
class Pen{
    //Properties
    String color;
    int tip;

    void setColor(String newColor){
        this.color = newColor;
    }
    void setNewTip(int newTip){
        this.tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage; // cgpa

    void calcPercentage(float phy, float math, float bio){
        this.percentage = phy + bio + math / 3;
    }
}