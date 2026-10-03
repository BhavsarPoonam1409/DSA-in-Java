package Inheritance;

//base class
class Grandfather{
    void house(){
        System.out.println("Grandfather house");
    }
}
//derived class
class Father extends Grandfather{
    void car(){
        System.out.println("father car");
    }
}

//dderived class
class Son extends Father{
    void bike(){
        System.out.println("son bike");
    }
}
public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        Son s = new Son();
        s.house();
        s.car();
        s.bike();
    }
}
