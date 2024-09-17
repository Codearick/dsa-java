Here’s the **README** file for the practice questions:

---

# OOPS Practice Questions - Java

This repository contains a set of practice questions related to Object-Oriented Programming (OOPS) concepts in Java. These questions are designed to help you strengthen your understanding of fundamental OOPS principles such as inheritance, method overriding, access modifiers, abstract classes, and exception handling.

## **Questions**

### **Question 1: Operations on Complex Numbers**
Write a Java program to perform the following operations on two complex numbers:
- **Sum**
- **Difference**
- **Product**

Create a class named `Complex` with separate methods for each operation. The real and imaginary parts should be entered by the user.

---

### **Question 2: Inheritance and Method Overriding**
Consider the following program and determine the output:

```java
class Automobile {
    private String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "Driving car";
    }
}

public class ElectricCar extends Car {
    @Override
    public final String drive() {
        return "Driving electric car";
    }

    public static void main(String[] wheels) {
        final Car car = new ElectricCar();
        System.out.print(car.drive());
    }
}
```
**Options:**
A. Driving vehicle  
B. Driving electric car  
C. Driving car  
D. The code does not compile  

---

### **Question 3: Access Modifiers in Inheritance**
Given the following code, choose the correct option for the `<access-modifier>`:

```java
// Shape.java
public class Shape {
    protected void display() {
        System.out.println("Display-base");
    }
}

// Circle.java
public class Circle extends Shape {
    <<access-modifier>> void display() {
        System.out.println("Display-derived");
    }
}
```

**Options:**
A. Only `protected` can be used.  
B. `public` and `protected` both can be used.  
C. `public`, `protected`, and `private` can be used.  
D. Only `public` can be used.

---

### **Question 4: Static Blocks and Constructors**
What will be the output of the following program?

```java
abstract class Car {
    static {
        System.out.print("1");
    }

    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}

public class BlueCar extends Car {
    {
        System.out.print("4");
    }

    public BlueCar() {
        super("blue");
        System.out.print("5");
    }

    public static void main(String[] gears) {
        new BlueCar();
    }
}
```

**Options:**
A. 23451  
B. 12354  
C. 13245  
D. The code does not compile

---

### **Question 5: Exception Handling**
Read up about the basics of exception handling from the following link:  
[Exception Handling - w3schools](https://www.w3schools.com/java/java_try_catch.asp)

---

## **Instructions**
1. Go through each question carefully.
2. Write your solutions in a separate file.
3. Test your code to verify the output.
4. You can find the answers and detailed explanations in the `answers.md` file.

---

### **Happy Learning and Coding!**

