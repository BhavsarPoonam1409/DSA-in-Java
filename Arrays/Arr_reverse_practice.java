public class Arr_reverse_practice {
    public static void reverse(int numbers[]){
        int start = 0;
        int end = numbers.length - 1; //n-1

        for(int i=0; i<numbers.length; i++){
            if(start<end){
                int tmp = numbers[end];
                numbers[end] = numbers[start];
                numbers[start] = tmp;

            }
        }
    }
    public static void main(String[] args) {
        int numbers [] = {10,20,30,40,50};
        reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
