import java.util.Scanner;
public class Arr_basic_practice {
    public static void main(String[] args) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter java marks: ");
        marks[0] = sc.nextInt();

        System.out.println("Enter python marks: ");
        marks[1] = sc.nextInt();

        System.out.println("Enter DSA marks: ");
        marks[2] = sc.nextInt();

        System.out.println("Java marks: "+marks[0]);
        System.out.println("Python marks: "+marks[1]);
        System.out.println("DSA marks: "+marks[2]);
        sc.close();
    }
}
