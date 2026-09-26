import java.util.Scanner;
public class Create2D_arr_Search_Key{

    //key search
    public static boolean searchKey(int matrix[][],int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] ==  key){
                    System.out.println("Key is found ("+i+","+j+")");
                    return true;
                    
                }
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                //input 
                // System.out.print("Enter value: "); loop me chlta hi rhega 
                matrix[i][j] = sc.nextInt();
                
            }
        }

        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            

            sc.close();
        }
        searchKey(matrix, 5);
    }
}