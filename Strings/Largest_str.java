public class Largest_str {
    public static void main(String[] args) {
        String fruites[]={"apple","mango","banana","kivi"};

        String largest = fruites[0];

        for(int i=1; i<fruites.length; i++){
            if(largest.compareTo(fruites[i])<0){
                largest = fruites[i];
            }
        }
        System.out.println(largest);
    }
}
