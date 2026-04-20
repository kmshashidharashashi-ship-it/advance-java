package stringoperations;

import java.util.Scanner;

public class p2 {

    // User-defined function
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Checking condition
        if (isNullOrEmpty(input)) {
            System.out.println("The string is NULL or contains only whitespace.");
        } else {
            System.out.println("The string is NOT null and contains valid characters.");
        }

        sc.close();
    }
}


