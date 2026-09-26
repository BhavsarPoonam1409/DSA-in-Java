import java.util.Scanner;
public class Avarage_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[]=new int[3];
        System.out.print("enter 1st marks: ");
        marks[0] = sc.nextInt();

        System.out.print("enter 2nd marks: ");
        marks[1] = sc.nextInt();
        
        System.out.print("enter 3rd marks: ");
        marks[2] = sc.nextInt();

        System.out.println("first marks: "+marks[0]);
        System.out.println("second marks: "+marks[1]);
        System.out.println("third marks: "+marks[2]);

        //avg of three no 
        int total = marks[0] +marks[1] + marks[2];
        System.out.println("totla marks: "+total);

        int avg = (marks[0]+marks[1]+marks[2]) / 3;
        System.out.println("avg marks: "+avg+"%");
        sc.close();
    }
}
