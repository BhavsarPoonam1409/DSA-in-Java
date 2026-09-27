package Operations;

public class Get_ith_bit {
    public static int getIthBit(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        //i = position
        System.out.println(getIthBit(10, 3));
    }
}
