Here’s the **solution file** for the practice questions:

---

# OOPS Practice Questions - Solutions

This file contains the solutions and explanations for the OOPS practice questions.

---

### **Question 1: Operations on Complex Numbers**

**Solution:**

```java
import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    // Constructor to initialize complex number
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    // Method to display a complex number
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for the first complex number
        System.out.print("Enter real and imaginary part of the first complex number: ");
        double real1 = sc.nextDouble();
        double imaginary1 = sc.nextDouble();
        Complex c1 = new Complex(real1, imaginary1);

        // Input for the second complex number
        System.out.print("Enter real and imaginary part of the second complex number: ");
        double real2 = sc.nextDouble();
        double imaginary2 = sc.nextDouble();
        Complex c2 = new Complex(real2, imaginary2);

        // Performing operations
        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        // Displaying results
        System.out.print("Sum: ");
        sum.display();
        System.out.print("Difference: ");
        difference.display();
        System.out.print("Product: ");
        product.display();

        sc.close();
    }
}
```

---

### **Question 2: Inheritance and Method Overriding**

**Explanation:**
In the given program, the method `drive()` in the `Automobile` class is `private`, so it cannot be inherited by subclasses. The method in `Car` and `ElectricCar` overrides it with different access modifiers. The code will compile successfully, and since `ElectricCar` overrides `Car`'s `drive()` method, the output will be:

**Output:**
`Driving electric car`

**Answer:**
**B. Driving electric car**

---

### **Question 3: Access Modifiers in Inheritance**

**Explanation:**
In Java, when overriding a method in a subclass, the access modifier of the overridden method can only be more permissive or the same as the method in the parent class. Since the method `display()` in `Shape` is `protected`, the overriding method in `Circle` can be `protected` or `public` but not `private`.

**Answer:**
**B. public and protected both can be used.**

---

### **Question 4: Static Blocks and Constructors**

**Explanation:**
The program contains static blocks, instance initializer blocks, and constructors. Here is the sequence of execution:
1. Static block: `"1"` is printed first (because static blocks run when the class is loaded).
2. Constructor of `Car`: `"2"` is printed when the `super()` call is made.
3. Instance initializer block of `Car`: `"3"` is printed when an instance is created.
4. Instance initializer block of `BlueCar`: `"4"` is printed next.
5. The rest of the `BlueCar` constructor runs, printing `"5"`.

So, the complete output is: `12354`.

**Answer:**
**B. 12354**

---

### **Question 5: Exception Handling**

**Explanation:**
You can refer to [w3schools' Java Exception Handling Guide](https://www.w3schools.com/java/java_try_catch.asp) to review the basics of try-catch blocks, exceptions, and how they are handled in Java. Study the material and practice handling different types of exceptions in your code.

---

### **Happy Coding!**

