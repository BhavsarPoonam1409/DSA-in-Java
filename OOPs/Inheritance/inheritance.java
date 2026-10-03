package Inheritance;

//parent class
class Animal{
    String color;

    void eat(){
        System.out.println("eating...!!");
    }

    void Breath(){
        System.out.println("breating...!!");
    }
}

//child classs
class Fish extends Animal{
    int fings; //phnk

    void swimming(){
        System.out.println("swimming in water..!!");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.eat();
        f.Breath();
        f.swimming();

        f.color = "blue";
        System.out.println(f.color);

        f.fings = 10;
        System.out.println(f.fings);
    }
}
