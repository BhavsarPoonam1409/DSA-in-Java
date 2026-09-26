public class Str_comparesion {
    public static void main(String[] args) {
        String s1 = "POONAM";
        
        String s2 = new String("POONAM");

        if(s1.equals(s2)){
            System.out.println("Strings are equals");
        }
        else{
            System.out.println("Strings are not equals");
        }

    }
}
