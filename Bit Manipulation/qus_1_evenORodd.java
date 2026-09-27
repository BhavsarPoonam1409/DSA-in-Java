public class qus_1_evenORodd {
    public static void evenOrOdd(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("even no: "+n);
        }
        else{
            System.out.println("odd no: "+n);
        }
    }
    public static void main(String[] args) {
        evenOrOdd(3);
        evenOrOdd(5);
        evenOrOdd(14);
    }
}
