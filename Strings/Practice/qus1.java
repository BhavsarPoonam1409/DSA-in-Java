package Practice;

import java.util.*;
public class qus1 {

    // public static boolean isVowels(char ch){
    //     return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    // }
    public static int countVowles(String input){
        int count = 0;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //lowercase string count how much vowel usinh input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = sc.nextLine();

        int voewlcount = countVowles(input);
        System.out.println(voewlcount);
        sc.close();
    }
}

//tc = o(n)
