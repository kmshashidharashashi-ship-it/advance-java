package stringoperations;

import java.util.Random;
import java.util.Scanner;

public class p9 {

    // User-defined function
    public static String generateRandomString(int length) {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(chars.length());
            result.append(chars.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter length of random string: ");
        int length = sc.nextInt();

        // Generate string
        String randomStr = generateRandomString(length);

        // Output
        System.out.println("Random String: " + randomStr);

        sc.close();
    }
}

