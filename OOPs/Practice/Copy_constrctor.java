package Practice;

class Student {

    String name;
    int age;
    String password;
    int marks[];

    // Copy Constructor - Shallow Copy
    Student(Student s1) {

        this.name = s1.name;
        this.age = s1.age;
        this.password = s1.password;
        this.marks = s1.marks;
    }

    Student() {
        marks = new int[3];
        System.out.println("Constructor called..!!");
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

        System.out.println("---- Student 1 Data -----");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.password);

        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }

        // Copy Constructor
        Student s2 = new Student(s1);

        s2.password = "xyzzzzzz";

        System.out.println("----- Student 2 Data -----");

        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.password);

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}