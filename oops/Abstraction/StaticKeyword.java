public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.schoolName = "SMIT";

        System.out.println("S2 School: " + s2.schoolName);
        
    }
}

class Student{
    String name;
    int rollno;

    static String schoolName;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}