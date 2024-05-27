package JavaIfElse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int N = scanner.nextInt();
        if (N>1&&N<100) {
            if (N % 2 == 0) {
                if (N > 2 && N < 5) {
                    System.out.println(" Not Wierd");
                } else if (N > 6 && N < 20) {
                    System.out.println("Wierd");
                } else if (N > 20) {
                    System.out.println("Not Wierds");
                }
            } else {
                System.out.println("Wierd");
            }
        }
    }
}
