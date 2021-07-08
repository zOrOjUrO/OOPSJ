package oopsj.OOPS;

import java.util.Scanner;

class Address {

    int streetNum;
    String city, state, country;

    Address(int street, String c, String st, String cunt){
        streetNum = street;
        city = c;
        state = st;
        country = cunt;
    }

    String info(){
        return ("\tStreet:\t"+streetNum+"\t|City:\t"+city+"\t|State:\t"+state+"\t|Country:\t"+country+"\n");
    }

}

class Student{
    String ID, name;
    Address address;
    Student(String USN, String Name, Address addr){
        this.ID = USN;
        this.name = Name;
        this.address = addr;
    }

    String info(){
        return("\nUSN:\t"+ID+"\t|Name:\t"+name+"\t|Address::"+address.info());
    }
}

class College{
    String name;
    Address address;
    College(String Name, Address addr){
        name = Name;
        address = addr;
    }

    String info(){
        return("COLLEGE:\t"+name+"\t|CLG ADDRESS::"+address.info()+"\n");
    }
}

class Employee{
    String ID, name;
    Address address;
    Employee(String EmpID, String Name, Address addr){
        ID = EmpID;
        name = Name;
        address = addr;
    }
    String info(){
        return("\nEMPLOYEE ID:\t"+ID+"\t|NAME:\t"+name+"\t|ADDRESS::"+address.info());
    }
}

public class DataRecords{
    private static final Scanner inLine = new Scanner(System.in);
    static Address address;
    static Student[] students;
    static College[] college;
    static Employee[] employees;

    static void getStudents(){
        String USN, name, city, state, country, collegeName;
        int streetNum;
        for(int i = 1; i <= students.length; i++) {

            System.out.print("\nEnter the student" + i + " 's USN: ");
            USN = inLine.next();
            System.out.print("Enter the student" + i + " 's NAME: ");
            name = inLine.next();
            System.out.print("Enter the student" + i + " 's STREET NUMBER: ");
            streetNum = inLine.nextInt();
            System.out.print("Enter the student" + i + " 's CITY: ");
            city = inLine.next();
            System.out.print("Enter the student" + i + " 's STATE: ");
            state = inLine.next();
            System.out.print("Enter the student" + i + " 's COUNTRY: ");
            country = inLine.next();

            address = new Address(streetNum, city, state, country);
            students[i-1] = new Student(USN, name, address);

            System.out.print("\nEnter the student" + i + " 's COLLEGE NAME: ");
            collegeName = inLine.next();
            System.out.print("Enter the student" + i + " 's COLLEGE'S STREET NUMBER: ");
            streetNum = inLine.nextInt();
            System.out.print("Enter the student" + i + " 's COLLEGE'S CITY: ");
            city = inLine.next();
            System.out.print("Enter the student" + i + " 's COLLEGE'S STATE: ");
            state = inLine.next();
            System.out.print("Enter the student" + i + " 's COLLEGE'S COUNTRY: ");
            country = inLine.next();

            address = new Address(streetNum, city, state, country);
            college[i-1] = new College(collegeName, address);
        }
    }

    static void getEmployees(){
        String ID, name, city, state, country;
        int streetNum;
        for(int i = 1; i <= students.length; i ++) {

            System.out.print("\nEnter the employee" + i + " 's ID: ");
            ID = inLine.next();
            System.out.print("Enter the employee" + i + " 's NAME: ");
            name = inLine.next();
            System.out.print("Enter the employee" + i + " 's STREET NUMBER: ");
            streetNum = inLine.nextInt();
            System.out.print("Enter the employee" + i + " 's CITY: ");
            city = inLine.next();
            System.out.print("Enter the employee" + i + " 's STATE: ");
            state = inLine.next();
            System.out.print("Enter the employee" + i + " 's COUNTRY: ");
            country = inLine.next();

            address = new Address(streetNum, city, state, country);
            employees[i-1] = new Employee(ID, name, address);
        }
    }

    static void putStudents(){
        for(int i = 1; i <= students.length; i++) {
            System.out.print(students[i-1].info() + college[i-1].info());
        }
    }

    static void putEmployees(){
        for(int i = 1; i <= employees.length; i++) {
            System.out.print(employees[i-1].info());
        }
    }

    public static void main(String[] args){
        System.out.println("PROGRAM TO DEMONSTRATE PASSING OF AN OBJECT TO A CONSTRUCTOR\n\tDATA RECORDS\n\n");

        System.out.print("Enter The Number Of Records that you you want to read: ");
        int n = inLine.nextInt();
        students = new Student[n];
        college = new College[n];
        employees =new Employee[n];
        System.out.println("\n\nEnter "+n+" Students' Details::\n");
        getStudents();
        System.out.println("\n\nEnter "+n+" Employee' Details::\n");
        getEmployees();
        System.out.println("\n\t\t\tWRITING THE STUDENTS DATA:\n");
        putStudents();
        System.out.println("\n\t\t\tWRITING THE EMPLOYEE DATA:\n");
        putEmployees();
    }
}
