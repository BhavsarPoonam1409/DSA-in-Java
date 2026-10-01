class Student{
    String name;
    int rollno;

    //create constrctor
    Student(String n,int r){
        this.name = n;
        this.rollno = r;
    }
}

class Constructer{
    Constructer(){
        System.out.println("this is constrctor class..!!");
    }
}

public class Constructors {
    public static void main(String[] args) {
        //create obj student but woh constrctor ka obj create hogha
        Student s1 = new Student("Poonam", 07);
        System.out.println(s1.name);
        System.out.println(s1.rollno);

        Constructer c1 = new Constructer();
        // System.out.println(c1);
    }
}
