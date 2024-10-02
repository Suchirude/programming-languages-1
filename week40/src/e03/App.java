package src.e03;

import java.util.Scanner;

public class App {
    private static final Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a name: ");
        var input = scanner.nextLine();
        System.out.println("You entered: " + input);
        StringBuilder stringBuilder = new StringBuilder(input);
        for(int i = input.length() - 1; i >= 0; i--){
            System.out.println(stringBuilder.charAt(i));
        }
    }
}