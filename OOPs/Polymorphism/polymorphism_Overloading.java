package Polymorphism;

class Calculator{
    int sum(int a,int b){
        return a + b;
    }

    int sum(int a,int b,int c){
        return a + b + c;
    }

    float sum(float a,float b){
        return a + b;
    }
}

public class polymorphism_Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println(calc.sum(14, 9));
        System.out.println(calc.sum(14,9,2007));
        System.out.println(calc.sum(14.0f, 9.0f));

        System.out.println(calc.sum((float)14.0,(float) 9.0));
    }
}
