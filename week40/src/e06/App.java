package src.e06;


import java.util.Objects;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        var input = scanner.nextLine();
        if(isAPalindrome(input)){
            System.out.println(input + " is a palindrome");
        }
        else{
            System.out.println(input + " is not a palindrome");
        }

    }

    private static boolean isAPalindrome(String inputString){
        inputString = inputString.toLowerCase();
        var stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return Objects.equals(stringBuilder.toString(), inputString);
    }


}