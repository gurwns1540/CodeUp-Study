package 논리연산.논리002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println((a == 1 && b == 1) ? (1) : (0));
    }
}
