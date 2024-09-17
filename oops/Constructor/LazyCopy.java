
public class LazyCopy {
    public static void main(String [] args){
        Student s1 = new Student();
        s1.name = "Rohan";
        s1.rollno = 202016026;
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 100;

        Student s2 = new Student(s1);
        
        s2.marks[2] = 200;

        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println("Marks of 3 subjects "+ s2.marks[i]);
            System.out.println("Changed  marks is : " + s1.marks[i]);
        }
    }
}
class Student{
    String name;
    int rollno;
    int [] marks;

    Student(){
        marks = new int[3];
        System.out.println("This is the constructor of the student");
    }

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        marks = s1.marks;

        marks = marks.clone();
    }
}