public class Subarr_practice {

    public static void subarrays(int numbers[]){
        int total = 0;
       
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                int sum = 0;
                for(int k=start; k<=end; k++){
                    sum = sum + numbers[k];
                    
                    System.out.println(numbers[k]);
                }
                System.out.println("=> sum: "+sum);
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarr: "+total);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subarrays(numbers);
    }
}
