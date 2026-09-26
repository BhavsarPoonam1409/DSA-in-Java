import java.util.Scanner;
public class Smallest_element_2Darr {

    public static int smallest_element(int matrix[][]){
         //smallest
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];

        int n = matrix.length, m=matrix[0].length;
        Scanner sc = new Scanner(System.in);

        //input
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int result = smallest_element(matrix);
        System.out.println("smallest elemnt is: "+result);


        sc.close();
    }
}
