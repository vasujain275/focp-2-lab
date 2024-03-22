// Create a class named Animal with a constructor that initializes the name property. Create a subclass named Dog that extends Animal. In the Dog subclass, implement a constructor that takes both name and breed parameters. Inside the Dog constructor, use super() to call the constructor of the Animal superclass, passing the name parameter. Write a display method in Dog class to display its members, i.e. name and breed. Instantiate a Dog object and demonstrate the proper initialization of properties inherited from the Animal class.

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

public class Question06 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.display();
    }
}
