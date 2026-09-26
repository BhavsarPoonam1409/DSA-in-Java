public class Smallest_no {

    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,5,7,10};
        int result = getSmallest(numbers);
        System.out.println("smallest numbers: "+result);
    }
}
