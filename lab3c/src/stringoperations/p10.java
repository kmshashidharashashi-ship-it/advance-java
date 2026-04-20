package stringoperations;

import java.util.Scanner;

public class p10 {

    // User-defined function
    public static int countWords(String str) {

        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split by one or more spaces
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Counting words
        int count = countWords(input);

        // Output
        System.out.println("Number of words: " + count);

        sc.close();
    }
}





