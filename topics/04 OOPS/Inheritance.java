public class Inheritance {
    public static void main(String args[]) {
        Dog dobby = new Dog();
        dobby.breathe();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

// Base class
class Animal {
    String color;
    void eat() {
        System.out.println("eats...");
    }

    void breathe() {
        System.out.println("breathes...");
    }
}

// Derived class
class Fish extends Animal {
    int fins;
    void swims() {
        System.err.println("swims...");
    }
}

// Single level inheritance
class Mammal extends Animal {
    int legs;
}

// Multi level inheritance
class Dog extends Mammal {
    String breed;
}

// Here class fish and mammal are hierarchial inheritance
// Here class fish, mammal and Dog are hybrid inheritance