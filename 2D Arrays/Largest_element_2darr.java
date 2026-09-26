import java.util.Scanner;
public class Largest_element_2darr {
    public static int Largest_element(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int  i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]>largest){
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        int result = Largest_element(matrix);
        System.out.println("largest elemnt is: "+result);
        

    }
    
}
