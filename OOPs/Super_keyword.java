class Animal{
    String color;
    //animal constrocter
    Animal(){
        System.out.println("animal constructor called..!!");
    }
}

class Hourse extends Animal{
    
    Hourse(){
        super.color = "brown";
        System.out.println("hourse constructor called..!!");
    }
}

 
public class Super_keyword {
    public static void main(String[] args) {
        Hourse myHourse = new Hourse();
        System.out.println(myHourse.color);
    }
}
