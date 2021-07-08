package oopsj.OOPS;

import java.util.Scanner;

class Circle{
    double radius;
    String color;

    Circle(){
        this.radius = 1.0d;
        this.color = "Grey";
    }

    Circle(double radius){
        this.radius = radius;
        this.color = "Grey";
    }

    Circle(double r, String c){
        this.radius = r;
        this.color = c;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

    void setColor(String color){
        this.color = color;
    }

    double getRadius(){
        return radius;
    }

    String getColor(){
        return color;
    }

    double getArea(){
        return(Math.PI*this.radius*this.radius);
    }

    String info(){
        return ("Circle::\n\t\tColor: "+getColor()+"\n\t\tRadius: "+getRadius()+"\n\t\tArea: "+getArea()+"\n\t\t");
    }
}

class Cylinder extends Circle{
    double height;

    Cylinder(){
        super();
        this.height = 1.0d;
    }

    Cylinder(double h, double r){
        super(r);
        this.height = h;
    }

    Cylinder(double h, double r, String c){
        super(r, c);
        this.height = h;
    }

    void setHeight(double height){
        this.height = height;
    }

    double getHeight(){
        return height;
    }

    double getVolume(){
        return getArea()*this.height;
    }

    @Override
    String info(){
        return ("Cylinder: Subclass of "+super.info()+"height: "+getHeight()+"\n\t\tVolume: "+getVolume()+"\n");
    }
}

public class inhertNPolyDemo {

    static boolean checkCylinders(Cylinder a, Cylinder b){
        return (a.getColor().equals(b.getColor()) && a.getArea() == b.getArea() && a.getVolume() == b.getVolume());
    }

    public static void main(String[] args){
        double radius, height;
        Scanner inLine = new Scanner(System.in);
        String color;
        Cylinder cylinder1 = null, cylinder2 = null;
        System.out.println("PROGRAM TO DEMONSTRATE INHERITANCE AND POLYMORPHISM BASED ON TWO CYLINDER SPECIFICATIONS");

        for(int i = 1; i < 3; i++) {
            System.out.print("\nEnter the Specifications of the " + i + ((i == 1) ? "st" : "nd") + " Cylinder:\n1 - Enter just the radius and height\n2 - Enter all values for radius, height and color\n Enter your choice: ");
            switch (inLine.nextInt()) {
                case 1:
                    System.out.print("\nEnter the radius and height values: ");
                    radius = inLine.nextDouble();
                    height = inLine.nextDouble();
                    if(i == 1) cylinder1 = new Cylinder(radius, height);
                    else cylinder2 = new Cylinder(radius, height);
                    break;
                case 2:
                    System.out.print("\nEnter the radius and height values: ");
                    radius = inLine.nextDouble();
                    height = inLine.nextDouble();
                    System.out.print("\nEnter the color of the cylinder: ");
                    color = inLine.next();
                    if(i == 1) cylinder1 = new Cylinder(radius, height, color);
                    else cylinder2 = new Cylinder(radius, height, color);
                    break;
                default:
                    break;
            }
        }

        while(true){
            assert cylinder1 != null;
            assert cylinder2 != null;
            System.out.print("""


                    1 - Check the cylinders for Similarity
                    2 - Get First Cylinder's Details
                    3 - Get Second Cylinder's Details
                    4 - Change Specifications of 1st Cylinder
                    5 - Change the Specifications of 2nd Cylinder
                    Any Other number to Exit:\s""");
            int ch = inLine.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("\n"+((checkCylinders(cylinder1, cylinder2))?"Cylinders are Similar!":"Cylinders are NOT Similar!"));
                    break;
                case 2:
                case 3:
                    if(ch == 2) System.out.println(cylinder1.info());
                    else System.out.println(cylinder2.info());
                    break;
                case 4:
                case  5:
                    System.out.print("\n\tWhich Parameter do you wish to change?\n\t1 - radius\n\t2 - height\n\t3 - color\n\tEnter your choice: ");
                    switch (inLine.nextInt()) {
                        case 1 -> {
                            System.out.print("\nEnter the new radius value: ");
                            if (ch == 4) cylinder1.setRadius(inLine.nextDouble());
                            else cylinder2.setRadius(inLine.nextDouble());
                        }
                        case 2 -> {
                            System.out.print("\nEnter the new height value: ");
                            if (ch == 4) cylinder1.setHeight(inLine.nextDouble());
                            else cylinder2.setHeight(inLine.nextDouble());
                        }
                        case 3 -> {
                            System.out.print("\nEnter the new color of the cylinder: ");
                            if (ch == 4) cylinder1.setColor(inLine.next());
                            else cylinder2.setColor(inLine.next());
                        }
                        default -> System.out.println("\nInvalid Argument!\n");
                    }
                    break;
                default:
                    return;
            }
        }

    }
}
