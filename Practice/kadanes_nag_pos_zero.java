public class kadanes_nag_pos_zero {
    public static void kadanes(int numbers[]) {

        int ms = Integer.MIN_VALUE;
        int cs = 0;
        boolean allNegative = true;

        for(int i = 0; i < numbers.length; i++) {

            // Check whether all numbers are negative
            if(numbers[i] >= 0) {
                allNegative = false;
            }

            cs = cs + numbers[i];

            if(cs < 0) {
                cs = 0;
            }

            ms = Math.max(cs, ms);
        }

        // If all numbers are negative
        if(allNegative) {

            int maxNegative = numbers[0];

            for(int i = 1; i < numbers.length; i++) {
                maxNegative = Math.max(maxNegative, numbers[i]);
            }

            ms = maxNegative;
        }

        System.out.println("Maximum subarray sum: " + ms);
    }

    public static void main(String[] args) {

        int numbers[] = {-2, -3, -4, -1,};

        kadanes(numbers);
    }
}
