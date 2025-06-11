package demo;
import java.util.Scanner;

public class ArrayPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking number of elements
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        // Creating array
        int[] numbers = new int[n];

        // Reading input into array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Printing array
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
