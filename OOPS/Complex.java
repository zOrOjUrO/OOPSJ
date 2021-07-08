package oopsj.OOPS;

import java.util.Scanner;

import static java.lang.Math.abs;

class cNumber{
    float r, i;
    cNumber(float a, float b){
        r = a;
        i = b;
    }
}

public class Complex {

    static float real, imaginary;

    Complex(float a, float b){
        real = a;
        imaginary = b;
    }

    Complex(int a, int b){
        real = a;
        imaginary = b;
    }

    static void add(cNumber a, Complex b){
        b.real += a.r;
        b.imaginary += a.i;
    }

    static void subtract(cNumber a, Complex b){
        b.real -= a.r;
        b.imaginary -= a.i;
    }

    static void display(Complex num){
        System.out.println("\nThe Resultant Complex Number is:\n\t\t\t"+String.format("%.2f", num.real)+" "+ ((num.imaginary<0)?"- i":"+ i")+ String.format("%.2f",abs(num.imaginary)));
    }

    public static void main(String[] args) {
        System.out.println("PROGRAM TO PERFORM ADDITION AND SUBTRACTION OF TWO N=COMPLEX NUMBERS BY OBJECT PASSING TO FUNCTIONS");
        Complex complexNum;
        System.out.print("\n\nEnter the Real and Imaginary components of the initial complex number as in, a and b values in:\na + ib\nor enter 0 to initial to zero: ");
        Scanner inLine = new Scanner(System.in);
        float a = inLine.nextFloat();
        float b;
        if((int)a == 0)
             complexNum = new Complex((int)a, (int)a);
        else {
            b = inLine.nextFloat();
            complexNum = new Complex(a, b);
        }
        while(true){
            System.out.print("\n\n1 - Add a complex number to the number\n2 - Subtract a complex number from the number\n3 - Display the complex number\nAny other number to exit\nEnter your choice: ");
            int n = inLine.nextInt();
            switch (n){
                case 1:
                    System.out.print("\n\nEnter the Real and Imaginary components of the initial complex number as in, a and b values in:\na + ib: ");
                    a = inLine.nextFloat();
                    b = inLine.nextFloat();
                    add(new cNumber(a, b), complexNum);
                    break;
                case 2:
                    System.out.print("\n\nEnter the Real and Imaginary components of the initial complex number as in, a and b values in:\na + ib: ");
                    a = inLine.nextFloat();
                    b = inLine.nextFloat();
                    subtract(new cNumber(a, b), complexNum);
                    break;
                case 3:
                    display(complexNum);
                    break;
                default:
                    return;
            }
        }
    }
}
