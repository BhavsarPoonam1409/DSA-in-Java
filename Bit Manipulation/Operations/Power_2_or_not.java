package Operations;

public class Power_2_or_not {
    public static boolean power2_or_not(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(power2_or_not(8));
        System.out.println(power2_or_not(15));
    }
}
