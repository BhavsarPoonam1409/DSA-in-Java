package Practice;

class Student{
    String name;
    int age;
    String password;
    int marks[];

    //copy constrctor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        this.password = s1.password;

    }
    Student(){
        marks = new int[3];
        System.out.println("Constrctor called..!!");
    }

    
    
}

public class Copy_constrctor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "poonam";
        s1.age = 19;
        s1.password = "manoop";
        s1.marks[0] = 97;
        s1.marks[1] = 99;
        s1.marks[2] = 100;

        System.out.println("----student 1 data-----");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.password);
        for(int i=0; i<3; i++){
            System.out.println(s1.marks[i]);
        }


        Student s2 = new Student(s1);
        s2.password = "xyzzzzzz";
        System.out.println("-----student 2 data-----");
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.password);
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

//steps
/*
1. create class
2. create constrctor
3. create obj
4.asssign the value s1 obj
5.copy constroct code
*/