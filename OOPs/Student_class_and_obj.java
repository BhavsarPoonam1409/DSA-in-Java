class Student{
    String name;
    int age;
    float perc;
    String course;
    String sem;


}


public class Student_class_and_obj {
    public static void main(String[] args) {
        //create obj for Student
        Student s1 = new Student();
        s1.name = "Poonam Bhavsar";
        s1.age = 18;
        s1.perc = 97;
        s1.course = "Software Development";
        s1.sem = "sem-3";

        System.out.println("Student name is: "+s1.name);
        System.out.println("Student age is: "+s1.age);
        System.out.println("Student percnatage is: "+s1.perc);
        System.out.println("Student course is: "+s1.course);
        System.out.println("Student sem is: "+s1.sem);
    }
}
