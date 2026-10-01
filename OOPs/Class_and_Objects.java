class Pen{
    //properties
    String color;
    int shade;

    //new color set and change
    void setColor(String newColor){
        color = newColor;
    }
    void setShade(int newShade){
        shade = newShade;
    }

}

public class Class_and_Objects{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.shade = 5;

        System.out.println("pen color is: "+p1.color);
        System.out.println("pen shade is: "+p1.shade);

        //func call
        p1.setColor("yellow");
        p1.setShade(7);

        System.out.println("Chhnaged color: "+p1.color);
        System.out.println("chnaged shade is: "+p1.shade);
    }
}