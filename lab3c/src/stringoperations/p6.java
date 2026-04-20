package stringoperations;

import java.util.Scanner;

public class p6 {

    // User-defined function
    public static String capitalizeWords(String str) {

        String[] words = str.split("\\s+"); // split by spaces
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter + باقي الكلمة
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Capitalizing words
        String output = capitalizeWords(input);

        // Output
        System.out.println("After Capitalizing: " + output);

        sc.close();
    }
}
