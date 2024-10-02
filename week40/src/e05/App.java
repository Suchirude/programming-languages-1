package src.e05;

import java.util.Objects;
import java.util.Scanner;

public class App {
    private static final Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a name: ");
        var input = scanner.nextLine();
        var stringBuilder = new StringBuilder(input);
        while(!Objects.equals(input, "Quit")){
            System.out.println(input);
            System.out.println(stringBuilder.toString());
            System.out.print("Enter a name: ");
            input = scanner.nextLine();
            stringBuilder.append(input);
        }
    }


}