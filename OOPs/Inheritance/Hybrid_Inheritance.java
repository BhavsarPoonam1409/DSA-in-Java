package Inheritance;



class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

    void breathe() {
        System.out.println("Animal is breathing");
    }
}

class Fish extends Animal {

    void swim() {
        System.out.println("Fish is swimming");
    }
}

class Tuna extends Fish {

    void smallSize() {
        System.out.println("Tuna is a small fish");
    }
}

class Shark extends Fish {

    void hunt() {
        System.out.println("Shark is hunting");
    }
}

class Bird extends Animal {

    void fly() {
        System.out.println("Bird is flying");
    }
}

class Peacock extends Bird {

    void dance() {
        System.out.println("Peacock is dancing");
    }
}

class Mammal extends Animal {

    void walk() {
        System.out.println("Mammal is walking");
    }
}

class Dog extends Mammal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Mammal {

    void meow() {
        System.out.println("Cat is meowing");
    }
}

class Human extends Mammal {

    void think() {
        System.out.println("Human is thinking");
    }
}

public class Hybrid_Inheritance {

    public static void main(String[] args) {

        Tuna t = new Tuna();

        t.eat();
        t.breathe();
        t.swim();
        t.smallSize();

        System.out.println();

        Shark s = new Shark();

        s.eat();
        s.breathe();
        s.swim();
        s.hunt();

        System.out.println();

        Peacock p = new Peacock();

        p.eat();
        p.breathe();
        p.fly();
        p.dance();

        System.out.println();

        Dog d = new Dog();

        d.eat();
        d.breathe();
        d.walk();
        d.bark();
    }
}