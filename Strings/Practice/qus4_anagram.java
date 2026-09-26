package Practice;

import java.util.Arrays;

public class qus4_anagram {


    public static boolean toAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }

        char[]arr1 = s.toCharArray();
        char[]arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);

    }
    public static void main(String[] args) {
        String s = "poonam";
        String t = "manoop";

        System.out.println(toAnagram(s, t));
    }
}

//optimize code for use hashmap key value pars
