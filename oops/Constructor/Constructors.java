package Constructor;
public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rohan");
        Student s3 = new Student(202016026);
    }
    
}

class Student{
    String name;
    int rollno;

    //Non parametrized constructor
    Student (){
        System.out.println("Constructor is called....!");
    }

    //Parameterized constructor
    Student(String name){
        this.name = name;
    }

    Student(int rollno){
        this.rollno = rollno;
    }
}
