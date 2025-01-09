package pekan6;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "admin";
        String password = "admin";
        int loginAttempts = 0;
        boolean loginSuccess = false;

        
        do {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            loginAttempts++;

            
            while (!inputUsername.equals(username) || !inputPassword.equals(password)) {
                System.out.println("Invalid credentials. Please try again.");
                System.out.print("Enter username: ");
                inputUsername = scanner.nextLine();
                System.out.print("Enter password: ");
                inputPassword = scanner.nextLine();
                loginAttempts++;
            }

            
            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                loginSuccess = true;
            }
        } while (!loginSuccess);

        
        System.out.println("Login successful! You had " + loginAttempts + " login attempts.");

        scanner.close();
    }
}