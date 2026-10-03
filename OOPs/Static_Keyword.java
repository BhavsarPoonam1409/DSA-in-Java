class Student{
    String name;
    int rollno;

    static String Schoolname;
}

public class Static_Keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Schoolname = "Jay Somnath high School";
        

        Student s2 = new Student();
        System.out.println(s2.Schoolname);
    }
}
