public class fun_str {

    public static void printLetters(){
        String str = "Poonam Bhavsar";

        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printLetters();
    }
}
