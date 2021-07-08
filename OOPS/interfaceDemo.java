package oopsj.OOPS;

/*
Create two classes called Lion and Snake that implements all the methods defined in an
interface Animal. Declare eat() method in Animal interface and display eating habits of that
particular animal .Create an interface called Tired Animal. In Tired Animal interface add
method definition to an existing interface by extending Animal interface to verify Extending
Interface concept in java.
Note: Lion and Snake implement the required eat( ) method and has some of its own methods
and instance variables
*/

interface Animal{
    void eat();
}

interface TiredAnimal extends Animal{
    void sound();
}

class Lion implements Animal{
    public void eat(){
        System.out.println("LION IS EATING");
    }
    public void walk(){
        System.out.println("LION IS WALKING");
    }
    public void rest(){
        System.out.println("LION IS RESTING");
    }
}

class Snake implements TiredAnimal{
    public void eat(){
        System.out.println("SNAKE IS EATING");
    }
    public void walk(){
        System.out.println("SNAKE IS CRAWLING");
    }

    public void rest(){
        System.out.println("SNAKE IS RESTING");
    }

    @Override
    public void sound() {
        System.out.println("~HISSES~");
    }
}


public class interfaceDemo {
    public static void main(String[] args){
        System.out.println("PROGRAM TO DEMONSTRATE INTERFACE AND EXTENDING INTERFACE CONCEPT\n\n");
        Lion lion = new Lion();
        Snake snake = new Snake();
        System.out.println("Lion Class:\n\n");
        lion.walk();
        lion.rest();
        lion.eat();
        System.out.println("\nSnake Class:\n\n");
        snake.sound();
        snake.walk();
        snake.rest();
        snake.eat();
    }
}
