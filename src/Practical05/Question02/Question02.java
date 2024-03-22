// Create a class named 'Animal' with a method to print "This is an animal". Now create three other classes named 'Mammal', 'Bird', and 'Fish' inheriting the Animal class, each having a method to print "This is a mammal", "This is a bird", and "This is a fish" respectively. Create an object of the Fish' class and call the methods of both the 'Animal' and Fish' classes using this object.

package Practical05.Question02;

class Animal {
    void printAnimal() {
        System.out.println("This is an animal");
    }
}

class Mammal extends Animal {
    void printMammal() {
        System.out.println("This is a mammal");
    }
}

class Bird extends Animal {
    void printBird() {
        System.out.println("This is a bird");
    }
}

class Fish extends Animal {
    void printFish() {
        System.out.println("This is a fish");
    }
}

public class Question02 {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.printAnimal();
        fish.printFish();
    }
}
