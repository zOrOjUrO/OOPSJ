package oopsj.OOPS;
/*
Design and develop a Java program for the fruit market problem. The farmer will be able to
produce different types of fruits (apple, orange, grape, and watermelon), and put them in the
market to sell. The market has limited capacity and farmers have to stand in a queue if the
capacity is exceeded to sell their fruits. Consumers can come to the market any time and
purchase their desired fruits; and if the fruits they want to buy runs out, they are willing to
wait until the supply of that kind is ready. Examine and formulate an approach to address this
problem and implement the same using Java constructs for programming.
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
class Market {
    ArrayList<String> stock = new ArrayList<>();
    int fruitsNumber;
    int salesCount;
    int sales = 0;
    String[] fruits = {"Apple", "0range", "Grape", "Watermelon", "Mango"}; //fruits to produce

    //constructing the marketplace with given fruit capacity
    public Market(int fruitsNumber, int salesCount) {
        if (fruitsNumber > 0 && salesCount > 0) {
            this.fruitsNumber = fruitsNumber;
            this.salesCount= salesCount;
        } else {
            throw new IllegalArgumentException("Invalid Argument!");
        }
    }

    // check if there is place in the marketplace
    synchronized boolean isFull() {
        return stock.size() == this.fruitsNumber;
    }

    //check if stocks empty
    synchronized boolean isEmpty() {
        return stock.isEmpty();
    }

    //consumer and producer methods
    public void farmer() throws InterruptedException {
        while (this.sales != this.salesCount) {
            synchronized (this) {
                while (isFull()) {
                    System.out.println("\nF: Market Full Right Now! Check Back Later :)");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("\nF: Interruption");
                    }
                }
                String nextProd = fruits[(new Random()).nextInt(fruits.length)];
                stock.add(nextProd);
                if(this.sales != this.salesCount)
                    System.out.printf("\nF:: Fruit : %s is queued for Selling. %n", nextProd);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consumer() throws InterruptedException {
        while (this.sales != this.salesCount) {
            synchronized (this) {
                while (isEmpty()) {
                    //this.sales++;
                    System.out.println("\nC:\tAll Fruits Sold Out. :{ \n");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("\nC:\tInterrupt Encountered.");
                    }
                }
                String soldItem = stock.remove((new Random()).nextInt(stock.size()));
                System.out.printf("\nFruit %s is Sold.\n", soldItem);
                this.sales++;
                notify();
                Thread.sleep(1000);
            }
        }
    }
}

class Farmer extends Thread{
    Market market;
    Farmer(Market market){
        this.market = market;
    }

    public void run(){
        try {
            this.market.farmer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Customer extends Thread{
    Market market;
    Customer(Market market){
        this.market = market;
    }
    public void run(){
        try {
            this.market.consumer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\t\tPROGRAM TO DEMONSTRATE MULTITHREADED PROGRAMMING IN JAVA\n");
        System.out.print("Enter the Total Capacity of the Marketplace:");
        int marketCapacity = new Scanner(System.in).nextInt();
        System.out.print("\nEnter Total #Sales(Stop Cond): ");
        Market marketPlace = new Market(marketCapacity, new Scanner(System.in).nextInt());
        Farmer farmer = new Farmer(marketPlace);
        Customer customer = new Customer(marketPlace);
        farmer.start();
        customer.start();
        farmer.join();
        customer.join();
        System.out.println("\n\n\t\t\tJa mata ne! ^_^\n");
    }
}
