// 1.Write an abstract class named Shape with abstract methods calculateArea() and calculatePerimeter(), along with a concrete method displayInfo().
//
//2.displayInfo() method displays information about the shape including its area and perimeter and print it to console.
//
//3.Subclasses Rectangle and Circle are implemented with appropriate instance variables and methods to calculate area and perimeter.
//
//4.Each class definition is stored in its own .java file.
//
//5.The Main class demonstrates the functionality of the system by creating objects of Rectangle and Circle classes and invoking the displayInfo() method for each object.


package Practical06.Question05;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(5);
        rectangle.displayInfo();
        circle.displayInfo();
    }
}
