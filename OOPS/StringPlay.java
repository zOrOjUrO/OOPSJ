package oopsj.OOPS;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.out;

/*
String Handling
 i) Write a Java program to find the penultimate (next to last) word of a sentence.
ii) Write program to replace a string "python" with "java" and "java" with "python" in a
given string.
iii) Write a program that splits a string into a number of substrings with the help of string
split() method and then prints the substrings.
 */

public class StringPlay {
    public static void main(String[] args){
        System.out.println("\n\tPROGRAM TO DEMONSTRATE STRING HANDLING IN JAVA\n\n");
        while (true) {
            System.out.print("""
                    
                    
                    1) Find the Penultimate (next to last) word of a sentence.
                    2) Replace a string "python" with "java" and "java" with "python" in a
                    given string.
                    3) Split a string into a number of substrings with the help of string
                    split() method and then prints the substrings.
                    Any other number to Exit: """);
            switch (new Scanner(System.in).nextInt()) {
                case 1 -> getPenultimateWord();
                case 2 -> wordReplace();
                case 3 -> getSubStrings();
                default -> {
                    System.out.println("\t\tJa na! :wave:");
                    return;
                }
            }
        }
    }

    private static void getSubStrings() {
        System.out.print("\n\nEnter The Sentence: ");
        Scanner inLine = new Scanner(System.in);
        String sentence = inLine.nextLine();
        String delimiter = "";
        System.out.print("\nDefault Delimiter is \" \" (space)\n Press y to continue with default or Enter Custom Delimiter: ");
        delimiter = inLine.next();
        if(delimiter.equalsIgnoreCase("y"))
            delimiter = " ";
        for(String subString: sentence.split(delimiter)){
            System.out.print("\n"+subString);
        };
        System.out.println("\n\nContinue? y/n");
        String choice = inLine.next();
        if(choice.equalsIgnoreCase("N") || choice.equalsIgnoreCase("NO"))
            exit(0);
    }

    private static void getPenultimateWord() {
        System.out.print("\n\nEnter The Sentence: ");
        Scanner inLine = new Scanner(System.in);
        String sentence = inLine.nextLine();
        String penUlt;
        try {
            penUlt = sentence.split(" ")[sentence.split(" ").length - 2];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.print(e + "\nBaka! Enter A Sentence of atleast two words! \nIt's common sense tbh\n");
            penUlt = "NULL";
        }
        System.out.println("\n\tPenultimate Word: "+ penUlt);
        System.out.println("\nContinue? y/n");
        String choice = inLine.next();
        if(choice.equalsIgnoreCase("N") || choice.equalsIgnoreCase("NO"))
            exit(0);
    }

    private static void wordReplace() {
        System.out.print("\n\nEnter The Sentence: ");
        Scanner inLine = new Scanner(System.in);
        String sentence = inLine.nextLine();
        int index = 0;
        String[] words = sentence.split(" ");
        for(String word: words){
            if(word.equalsIgnoreCase("java"))
                words[index] = "Python";
            else if(word.equalsIgnoreCase("python"))
                words[index] = "Java";
            index++;
        }
        StringBuilder sentenceBuilder = new StringBuilder();
        for(String word: words)
            sentenceBuilder.append(word).append(" ");
        sentence = sentenceBuilder.toString();
        System.out.println("\nModified Sentence:\n"+ sentence);
        System.out.println("\n\nContinue? y/n");
        String choice = inLine.next();
        if(choice.equalsIgnoreCase("N") || choice.equalsIgnoreCase("NO"))
            exit(0);
    }

}
