package Abstraction;

abstract class Animal{
    String color;
    Animal(){
       
        System.out.println("Aniaml Constrctor called");
    }
    void eat(){
        System.out.println("eats");
    }
    
}

class Hourse extends Animal{
    Hourse(){
        System.out.println("hourse constrctor called");
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Mustang extends Hourse{
    Mustang(){
        System.out.println("mustang constructor called");
    }
}

public class Absraction_constructor {
    public static void main(String[] args) {
        // Hourse h = new Hourse();
        // h.walk();

        Mustang myhorse = new Mustang();
        myhorse.walk(); //hourse class ka walk print hogha
    }
}
