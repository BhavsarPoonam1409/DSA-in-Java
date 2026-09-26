public class kadanes_algo{
    //kaanes logic is koi bhi no postive se bada nagative ho jaye uss case me usko 0 krdo
    // koi bhi big nagative no an small postive ho tab cs 0 hogha
    public static void kadanes(int numbers[]){
        int  ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs = 0;
            }
            ms=Math.max(cs, ms);

        }
        System.out.println("maximum subarr sum: "+ms);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}