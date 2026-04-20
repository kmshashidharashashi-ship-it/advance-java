package stringoperations;

import java.util.Scanner;

public class p7 {

    // User-defined function
    public static String truncate(String str, int maxLength) {

        // If string is shorter or equal, return as it is
        if (str == null || str.length() <= maxLength) {
            return str;
        }

        // Otherwise truncate and add ellipsis
        return str.substring(0, maxLength) + "...";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter maximum length: ");
        int length = sc.nextInt();

        // Calling function
        String result = truncate(input, length);

        // Output
        System.out.println("Truncated String: " + result);

        sc.close();
    }
}




