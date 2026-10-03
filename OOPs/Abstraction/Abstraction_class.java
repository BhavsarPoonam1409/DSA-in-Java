package Abstraction;

abstract class Animal{
    String color;

    //non abstarct method
    void eat(){
        System.out.println("eating..");
    }
    //abstarct method
    abstract void walk();
}

class Hours extends Animal{
    void walk(){
        System.out.println("walks on 4 lengs");
    }
}

class Chiken extends Animal{
    void walk(){
        System.out.println("walks on 2 lengs");
    }
}
public class Abstraction_class {
    public static void main(String[] args) {
        Chiken c = new Chiken();
        c.eat();
        c.walk();
    }
}
