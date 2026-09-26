public class Linear_Search_Practice_qus {
    public static String Linearsearch(String menu[], String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i].equals(key)){
                return menu[i];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        String menu[] = {"vadapav","dosa","gulabjamun"};
        String key = "dosa";

        // String storingval = Linearsearch(menu, key);
        String storingval = Linearsearch(menu, key);
        if(storingval == null){
            System.out.println("not found");
        }
        else{
            System.out.println("your key is: "+storingval);
        }
    }
}
