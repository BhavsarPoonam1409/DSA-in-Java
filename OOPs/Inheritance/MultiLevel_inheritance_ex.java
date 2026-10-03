package Inheritance;

class SDA2{
    void sda_2(){
        System.out.println("working as sda2 experiance");
    }
}

class SDA1 extends SDA2{
    void sda_1(){
        System.out.println("working as sda1 experiance");
    }
}

class Intern extends SDA1{
    void intern(){
        System.out.println("wrking as fresher");
    }
}
public class MultiLevel_inheritance_ex {
    public static void main(String[] args) {
        Intern stu = new Intern();
        System.out.println("----Intern give a sda1 and sda2 knowldge and experinence----");
        stu.sda_2();
        stu.sda_1();
        stu.intern();
    }
}
