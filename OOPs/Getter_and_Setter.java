class Pen{
    private String color;
    private int shade;

    String getColor(){
        return this.color;
    }
    int getShade(){
        return this.shade;
    }

    void setColor(String color){
        this.color = color;
    }

    void setShade(int shade){
        this.shade = shade;
    }
}


public class Getter_and_Setter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println("Pen color is: "+p1.getColor());

        p1.setShade(5);
        System.out.println("Pen shade is: "+p1.getShade());
    }
}
