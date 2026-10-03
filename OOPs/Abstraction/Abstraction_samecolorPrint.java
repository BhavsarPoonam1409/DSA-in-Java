package Abstraction;

abstract class Animal{
    String color;

    Animal(){
        color = "brown";
    }

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

public class Abstraction_samecolorPrint {
   public static void main(String[] args) {
    Hours h = new Hours();
    h.walk();
    System.out.println(h.color);
   }

}
