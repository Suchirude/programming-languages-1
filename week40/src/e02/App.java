package src.e02;

import java.util.Scanner;

public class App {
    private static final Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a name: ");
        var input = scanner.nextLine();
        System.out.println("You entered: " + input);
        StringBuilder stringBuilder = new StringBuilder(input);
        for(int i = 0; i < input.length(); i++){
            System.out.println(stringBuilder.charAt(i));
        }
    }
}
