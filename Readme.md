Hey! This is just another lab repo. Contains the code for the programs that I executed in the OOPS WITH JAVA lab. 
If you're here, hope you find what you came for ^_^



The questions are as follows:

Classes and objects.

1. Create a Java class called Complex with the following details as member variables within it.
(i) Real (ii) Imaginary
Develop a Java program to perform addition and subtraction of two complex numbers by
using the method add() and subtract() respectively, by passing object as parameter and
display result using method display(). Initialize the real and imaginary values of the complex
number using parameterized constructor. Also demonstrate overloading constructors and
methods.


2. Design an Address class with member variables Street num, city, state and country and 
appropriate constructor. Design a Student class with constructor (Student (String USN,
String Name, Address addr)), College class with constructor (College (String Name, Address
addr)) and Employee class with constructor (Employee (String EmpID, String Name,
Address addr)). Write a Java program to create ānā Student objects, College Objects and
Employee objects and print the student, college and employee addresses respectively and
demonstrate passing of object as a parameter to the constructor.



Inheritance and Polymorphism.

3. Design a base class Circle with member variables (radius and color) of type double, methods
(getRadius(), getArea()) and constructors (Circle(radius), Circle(radius, color)). Derive
subclass called Cylinder from the superclass Circle with member variable (height) of type
double, public methods (getHeight(), getVolume(), getArea()) and its
constructors(Cylinder(height, radius), Cylinder(height, radius,color)). Create the two
instances of cylinder and print similar cylinders if the area, volume and color of cylinders are
same. Demonstrate the code reuse and polymorphism properties of Object oriented
programming by inheriting the constructors and methods of the base class.



Package and Interfaces

4. Create a class Thirdsem. Put this class into a package called CSE. Define a method
Welcomemsg which prints a line āWelcome to CSE dept- 3rd sem young budding
Engineersā.
Create a class Csedept. Put this class into a package called RVCE.
Inherit the class Thirdsem in CSE package to Csedept class in RVCE package and call
Welcomemsg method to display welcome message and also verify Public method
Overriding, Private method overriding and default method overriding from different
packages in java with the same program

5. Create two classes called Lion and Snake that implements all the methods defined in an
interface Animal. Declare eat() method in Animal interface and display eating habits of that
particular animal .Create an interface called Tired Animal. In Tired Animal interface add
method definition to an existing interface by extending Animal interface to verify Extending
Interface concept in java.
Note: Lion and Snake implement the required eat( ) method and has some of its own methods
and instance variables



Exception handling

6. Design and implement a Java program for the following requirements:
a) An Exception class called Demonetization Exception which returns the statement that
says āDeposit of Old currency of (Rs_____) crosses Rs. 5,000 and cannot be Depositedā.
b) A class called āAccountā that creates account with 500 Rs minimum balance with
following methods.
i. deposit(amount, currencyType) method to deposit amount. This class should
handle āDemonetization Exceptionā and print the message defined in this Exception
class. If a currency type is āOLDā and the amount is greater than 5,000 then throw
the Demonetization Exception, otherwise update the balance.
ii. currBalance() method that displays balance amount in the account.
iii. withdraw(amount) method to withdraw amount and update the balance. Use proper
control structure to check Balance should not go less than 500.
c) A āCustomerā class that creates Account object and call the methods deposit(),
withdraw() and currBalance() based on the user choice. 



Multithreading

7. Design and develop a Java program for the fruit market problem. The farmer will be able to
produce different types of fruits (apple, orange, grape, and watermelon), and put them in the
market to sell. The market has limited capacity and farmers have to stand in a queue if the
capacity is exceeded to sell their fruits. Consumers can come to the market any time and
purchase their desired fruits; and if the fruits they want to buy runs out, they are willing to
wait until the supply of that kind is ready. Examine and formulate an approach to address this
problem and implement the same using Java constructs for programming.


Lambda Expressions

8. Write the following methods that return a lambda expression performing a specified action:
(i) PerformOperation isOdd(): The lambda expression must return true if a number is odd
or false if it is even.
(ii) PerformOperation isPrime(): The lambda expression must return true if a number is
prime or false if it is composite.
(iii) PerformOperation isPalindrome(): The lambda expression must return true if a
number is a palindrome or false if it is not.
Write a JAVA program using above lambda expressions to take 2 integers as input where the
first integer specifies the condition to check for (case 1 for Odd/Even, case 2 for
Prime/Composite, or case 3 for Palindrome). The second integer denotes the number to be
checked.


Collections

9. Write a Java program to create a new array list, add some colors (string) and perform the
following operations:
(i) Add elements of List to ArrayList
(ii) Copy ArrayList to Array
(iii)Reverse ArrayList content
(iv) Get Sub list from an ArrayList.
(v) To sort a given ArrayList
(vi) Clone an ArrayList to another ArrayList

10. String Handling

i) Write a Java program to find the penultimate (next to last) word of a sentence.
ii) Write program to replace a string "python" with "java" and "java" with "python" in a
given string.
iii) Write a program that splits a string into a number of substrings with the help of string
split() method and then prints the substrings.