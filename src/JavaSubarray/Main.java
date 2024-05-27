package JavaSubarray;

import java.util.Scanner;
import java.io .*;
import java.util .*;
import java.text .*;
import java.math .*;
import java.util.regex .*;
public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        // Define array
        int[] arr = new int[scanner.nextInt()];
        // Adding array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int negativeSubArraysCount = 0;
        int sum = 0;
        for (int startIndex = 0; startIndex < arr.length; startIndex++) {
            for (int endIndex = startIndex; endIndex < arr.length; endIndex++) {
                for (int k = startIndex; k <= endIndex; k++) {
                    sum = sum + arr[k];
                }
                if (sum < 0) {
                    negativeSubArraysCount++;
                }
                sum = 0;
            }
        }
        System.out.println(negativeSubArraysCount);
    }

}
