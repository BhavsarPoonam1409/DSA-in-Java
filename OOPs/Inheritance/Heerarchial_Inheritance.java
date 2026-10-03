package Inheritance;

//only one base class multiple child/dirived class

class Animal{
    String color;

    void eat(){
        System.out.println("eating..!!");
    }
    void breath(){
        System.out.println("breathing");
    }
}

class mammal extends Animal{
    void walk(){
        System.out.println("walking..");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swimming..");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flying..");
    }
}

public class Heerarchial_Inheritance {
    public static void main(String[] args) {
        mammal m = new mammal();
        Fish f = new Fish();
        Bird b = new Bird();

        System.out.println("mammls func and animal: ");
        m.eat();
        m.breath();
        m.walk();
        System.out.println();

        System.out.println("Fish func and animal: ");
        f.eat();
        f.breath();
        f.swim();
        System.out.println();
        
        System.out.println("Bird func and animal: ");
        b.eat();
        b.breath();
        b.fly();
    }
}
