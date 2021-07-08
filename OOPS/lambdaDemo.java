package oopsj.OOPS;

/*

Write the following methods that return a lambda expression performing a specified action:
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

*/

import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int input);
}

class operatorCheck {
    public static boolean checker(PerformOperation op, int num) {
        return op.check(num);
    }

    public static PerformOperation isOdd(){
        return input -> input % 2 != 0;
    }

    public static PerformOperation isPrime(){
        return input ->{ for (int i = 2; i * i <= input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return input -> input == Integer.parseInt(new StringBuilder(String.valueOf(input)).reverse().toString());
    }
}

public class lambdaDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("\n\tPROGRAM TO DEMONSTRATE LAMBDA EXPRESSIONS IN JAVA\n\nTHE PROGRAM TAKES N CASES AND RETURNS THE RESULTS AT ONCE\n\n");
        operatorCheck opCheck = new operatorCheck();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nTests;
        try
        {
            nTests = Integer.parseInt(br.readLine());
        }catch (NumberFormatException e){
            nTests = Integer.parseInt(br.readLine());
        }
        PerformOperation operation;
        boolean res = false;
        String ans = null;
        StringBuilder outputBuilder = new StringBuilder();
        while (nTests-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int choice = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            switch (choice) {
                case 1 -> {
                    operation = opCheck.isOdd();
                    res = opCheck.checker(operation, num);
                    ans = res ? "ODD" : "EVEN";
                }
                case 2 -> {
                    operation = opCheck.isPrime();
                    res = opCheck.checker(operation, num);
                    ans = res ? "PRIME" : "COMPOSITE";
                }
                case 3 -> {
                    operation = opCheck.isPalindrome();
                    res = opCheck.checker(operation, num);
                    ans = res ? "PALINDROME" : "NON PALINDROME";
                }
                default -> ans = "INVALID CHOICE";
            }
            outputBuilder.append(num).append(" : ").append(ans).append("\n");
        }
        System.out.println("RESULT:\n" + outputBuilder);
    }
}

/*
IN 1:

10
1 23
1 22
1 990
2 23
2 42
2 7
2 997
3 929
3 881
3 0190290

IN 2:

5
1 4
2 5
3 898
1 3
2 12
 */