package stringoperations;

import java.util.Scanner;

public class p22 {

    // User-defined function
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index = index + subStr.length(); // move ahead
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter substring: ");
        String subStr = sc.nextLine();

        // Counting occurrences
        int result = countOccurrences(mainStr, subStr);

        // Output
        System.out.println("Occurrences of \"" + subStr + "\" = " + result);

        sc.close();
    }
}
