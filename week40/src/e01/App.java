package src.e01;

import java.util.Objects;
import java.util.Scanner;

public class App {
    private static final Scanner scanner  = new Scanner(System.in);
    private static final String nameToCheck = "Louis";
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        var input = scanner.nextLine();
        System.out.println(Objects.equals(input, nameToCheck) ? "Are you French?" : "You have a great name!");
    }
}
