// Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.

package Practical04b;

class Student {
    private String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

public class Question01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("John");
        Student student3 = new Student("Jane");
        Student student4 = new Student("Jack");
        Student student5 = new Student("Jill");

        student1.display();
        student2.display();
        student3.display();
        student4.display();
        student5.display();
    }
}
