public class Pairs_arr {

    public static void pairs_arr(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int current = numbers[i];
            //inner loop
            for(int j=i+1; j<numbers.length; j++){  //j=0 toh sab pairs print hoghe
                System.out.print("( "+current+","+numbers[j]+" )");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        pairs_arr(numbers);
    }
}
