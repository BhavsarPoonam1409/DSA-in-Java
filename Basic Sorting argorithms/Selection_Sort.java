public class Selection_Sort {

    public static void selectionsort(int arr[]) {

        for(int i = 0; i < arr.length - 1; i++) {

            int minposition = i;

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[j] < arr[minposition]) {
                    //update thyi value ahiya
                    minposition = j;
                }
            }

            // swap
            int tmp = arr[minposition];
            arr[minposition] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void main(String[] args) {

        int arr[] = {5, 4, 1, 3, 2};

        selectionsort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}