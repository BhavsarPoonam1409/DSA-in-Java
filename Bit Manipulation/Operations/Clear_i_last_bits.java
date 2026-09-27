package Operations;

public class Clear_i_last_bits {
    public static int clearILastBits(int n,int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        
    }
}
