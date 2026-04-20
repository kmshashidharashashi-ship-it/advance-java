package stringoperations;

import java.util.Scanner;

public class p8 {

    // User-defined function
    public static boolean isNumeric(String str) {

        if (str == null || str.isEmpty()) {
            return false;
        }

        // Check each character
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Checking numeric
        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does NOT contain only numeric characters.");
        }

        sc.close();
    }
}






