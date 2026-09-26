public class Largest_Arr {

    public static int getLareget(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {14,9,25,99,95,67,58,100};
        int result = getLareget(numbers);
        System.out.println("Largest number: "+result);
    }
}
