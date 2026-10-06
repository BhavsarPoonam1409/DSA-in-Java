package PracticeQuestions;


import java.util.Scanner;

class Complex {

    int real;
    int imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void sum(Complex c2) {
        int r = this.real + c2.real;
        int i = this.imaginary + c2.imaginary;

        System.out.println("Sum = " + r + " + " + i + "i");
    }

    void difference(Complex c2) {
        int r = this.real - c2.real;
        int i = this.imaginary - c2.imaginary;

        System.out.println("Difference = " + r + " + " + i + "i");
    }

    void product(Complex c2) {
        int r = (this.real * c2.real)
                - (this.imaginary * c2.imaginary);

        int i = (this.real * c2.imaginary)
                + (this.imaginary * c2.real);

        System.out.println("Product = " + r + " + " + i + "i");
    }
}

public class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first number: ");
        int real1 = sc.nextInt();

        System.out.print("Enter imaginary part of first number: ");
        int imaginary1 = sc.nextInt();

        System.out.print("Enter real part of second number: ");
        int real2 = sc.nextInt();

        System.out.print("Enter imaginary part of second number: ");
        int imaginary2 = sc.nextInt();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        c1.sum(c2);
        c1.difference(c2);
        c1.product(c2);

        sc.close();
    }
}

