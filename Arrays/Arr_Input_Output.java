import java.util.Scanner;
public class Arr_Input_Output {
    public static void main(String[] args) {
        int marks[] = new int[7];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a 1st sub marks: ");
        marks[0] = sc.nextInt();

        System.out.println("enter a 2nd sub marks: ");
        marks[1] = sc.nextInt();

        System.out.println("enter a 3rd sub marks: ");
        marks[2] = sc.nextInt();

        System.out.println("enter a 4th sub marks: ");
        marks[3] = sc.nextInt();

        System.out.println("enter a 5th sub marks: ");
        marks[4] = sc.nextInt();

        System.out.println("Advance java marks: "+marks[0]);
        System.out.println("Advance python marks: "+marks[1]);
        System.out.println("c++ marks: "+marks[2]);
        System.out.println("Linux marks: "+marks[3]);
        System.out.println("Excel marks: "+marks[4]);
        System.out.println("DSA marks: "+marks[5]);

        sc.close();
    }
}
