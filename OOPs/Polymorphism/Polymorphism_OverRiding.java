package Polymorphism;

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eating grass..");
    }
}

public class Polymorphism_OverRiding {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println("Animal eat method..!!");
        a.eat();

        System.out.println();

        Deer d = new Deer();
        System.out.println("Deer eat method..!!");
        d.eat();
    }
    
}
