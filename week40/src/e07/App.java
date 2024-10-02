package src.e07;

import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter password: ");
        var password = scanner.nextLine();
        var enteredValidPassword = isValid(password);
        while(!enteredValidPassword){
            System.out.println("Password is invalid. Needs to be at least 8 characters long and include at least one uppercase letter.");
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            enteredValidPassword = isValid(password);
        }
        System.out.println("Password is valid.");
    }

    private static boolean isValid(String password){
        var isLongEnough = password.length() >= 8;
        if(!isLongEnough) return false;
        var hasUppercaseLetter = false;
        var hasLowercaseLetter = false;
        var hasDigit = false;
        var isValid = false;
        var stringBuilder = new StringBuilder(password);
        for(int i = 0; i < stringBuilder.length(); i++){
            var currentCharacter = stringBuilder.charAt(i);
            if(Character.isUpperCase(currentCharacter)) hasUppercaseLetter = true;
            if(Character.isLowerCase(currentCharacter)) hasLowercaseLetter = true;
            if(Character.isDigit(currentCharacter)) hasDigit = true;
            isValid = hasDigit && hasLowercaseLetter && hasUppercaseLetter;
            if(isValid) break;
        }
        return isValid;
    }


}
