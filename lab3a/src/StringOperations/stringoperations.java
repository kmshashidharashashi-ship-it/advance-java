package StringOperations;

import java.util.*;

public class stringoperations {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "  Java Programming  ";
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("\nEquals: " + str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("hello"));

        // 4. String Searching
        System.out.println("\nIndex of 'o': " + str1.indexOf('o'));
        System.out.println("Contains 'lo': " + str1.contains("lo"));

        // 5. Substring Operations
        System.out.println("\nSubstring (0 to 4): " + str1.substring(0, 4));

        // 6. String Modification
        System.out.println("\nReplace 'l' with 'x': " + str1.replace('l', 'x'));
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 7. Whitespace Handling
        System.out.println("\nBefore Trim: '" + str3 + "'");
        System.out.println("After Trim: '" + str3.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + concat);

        // 9. String Splitting
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");
        System.out.println("\nSplitting words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(5, "Language ");
        System.out.println("\nStringBuilder Result: " + sb);

        // 11. String Formatting
        String formatted = String.format("Name: %s, Age: %d", "Aditya", 20);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Email Validation
        String email = "example@gmail.com";
        boolean valid = email.contains("@") &&
                        email.startsWith("example") &&
                        email.endsWith(".com");

        System.out.println("\nEmail: " + email);
        if (valid) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}