import java.util.Scanner;
public class Arr_update {
    public static void main(String[] args) {
        int marks[] = new int[50];
        
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();

        System.out.println("java marks: "+marks[0]);
        System.out.println("python marks: "+marks[1]);

        //update marks [1]
        marks[1] = 100;
        //marks[1] = marks[1] + 1;
        System.out.println("python marks: "+marks[1]);
        sc.close();
    }
}
