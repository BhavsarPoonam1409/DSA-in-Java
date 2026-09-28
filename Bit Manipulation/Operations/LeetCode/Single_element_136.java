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

//other qus  solve leetcode
/*
    1. 136 single number
    2. 268 missing number
    3. 192 numbers of bits 1
    4. 461 hamming distance
    5. 231 power of two or not
*/
