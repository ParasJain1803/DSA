public class Abstraction {
    public static void main (String args[]) {
        // Horse h = new Horse();
        // h.eat();
        // h.walks();

        // Chicken c =new Chicken();
        // c.eat();
        // c.walks();

        Mustang m = new Mustang();
        // Animal -> Horse -> Mustang
        m.eat();
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "black";
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("eats");
    }

    abstract void walks();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void walks() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
    void walks() {
        System.out.println("walks on 4 wheels");
    }
}

class Chicken extends Animal {
    void walks() {
        System.out.println("walks on 2 legs");
    }
}