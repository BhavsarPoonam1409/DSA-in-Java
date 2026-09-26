public class Palindrome_str {

    public static String Palindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not palindrome
                System.out.println("This string is not palindrome: " + str);
                return str;
                
            }
            
        }
        System.out.println("this string is palindorme: "+str);
        return str;
    }
    public static void main(String[] args) {
        String str = "poonam";

        Palindrome(str);
        
    }
}
