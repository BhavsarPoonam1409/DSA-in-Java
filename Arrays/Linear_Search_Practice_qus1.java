public class Linear_Search_Practice_qus1 {
    public static int Linearsearch(String menu[], String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i].equals(key)){
                return i; // index return
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        String menu[] = {"vadapav","dosa","gulabjamun"};
        String key = "dosa";

        int storingval = Linearsearch(menu, key);
        if(storingval == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("your key '"+key+"' is at index: "+storingval);
        }
    }
}
