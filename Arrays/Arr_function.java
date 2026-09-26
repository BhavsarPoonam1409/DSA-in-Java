public class Arr_function {
     public static void update(int marks[],int nonchangebal){
        nonchangebal = nonchangebal + 1;
            for(int i=0; i<marks.length; i++){
                marks[i] = marks[i]  + 1;
            }
        }
    public static void main(String[] args) {
       

        int marks[] = {95,99,92};
        int nonchangebal = 5;
        update(marks,nonchangebal);
        System.out.println("wahi value rhegi: "+nonchangebal);
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
    //this print using call by refrence 
    //arr ki value change hoo skti hain 

}
