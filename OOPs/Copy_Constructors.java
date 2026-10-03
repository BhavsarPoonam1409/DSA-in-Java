class Student{
    String name;
    int age;
    String Password;
    int marks[];

    //copy constrctor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        this.marks = s1.marks;
    }

    Student(){
        marks = new int[3];
        System.out.println("constructor called...");
    }

    Student(String name){
        marks = new int[3];
        this.name = name;
    }

    Student(int age){
        marks = new int[3];
        this.age = age;
    }
}
public class Copy_Constructors {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Poonam";
        s1.age = 19;
        s1.Password = "abc";
        s1.marks[0] = 99;
        s1.marks[1] = 97;
        s1.marks[2] =95;
        System.out.println("----- Student 1 Data -----");
        System.out.println(s1.Password);
        System.out.println(s1.name);
        System.out.println(s1.age);
        for(int i=0; i<3; i++){
            System.out.println(s1.marks[i]);
        }

        System.out.println();

        Student s2 = new Student(s1);
        s2.Password = "xyz";
        System.out.println("----- Student 2 Data -----");
        System.out.println(s2.Password);
        System.out.println(s2.name);
        System.out.println(s2.age);
        
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
