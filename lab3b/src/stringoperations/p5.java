package stringoperations;

import java.util.Scanner;

public class p5 {

    // User-defined function
    public static String removeWhitespace(String str) {
        // \s matches all whitespace characters (space, tab, newline)
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Removing whitespace
        String result = removeWhitespace(input);

        // Output
        System.out.println("String after removing whitespace: " + result);

        sc.close();
    }
}