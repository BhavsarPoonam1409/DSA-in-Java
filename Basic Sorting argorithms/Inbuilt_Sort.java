import java.util.Arrays;
import java.util.Collections;
public class Inbuilt_Sort {
    public static void main(String[] args) {
        int arr[] = {1,8,7,5,9,2};
        Integer arr2[] = {1,7,8,5,9,2};

        Arrays.sort(arr);
        // Arrays.sort(arr,1,3);  //starting and ending index


        Arrays.sort(arr2,Collections.reverseOrder());
        // Arrays.sort(arr2,1,3,Collections.reverseOrder());

        //acending
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //desending
        for(int i=0; i<arr.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
