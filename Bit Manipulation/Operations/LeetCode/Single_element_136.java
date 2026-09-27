package Operations.LeetCode;

public class Single_element_136 {
    public static int singleElement(int nums[]){
        int n = nums.length;
        int xor = 0;

        for(int i=0; i<n; i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1};
        System.out.println(singleElement(nums));
    }
}
