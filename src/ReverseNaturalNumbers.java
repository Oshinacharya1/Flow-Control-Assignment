import java.util.Scanner;

public class ReverseNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number: ");
        int n = scanner.nextInt();
        System.out.println("Reverse natural numbers from 1 to " + n + ":");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
    }


