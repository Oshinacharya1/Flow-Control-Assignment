import java.util.Scanner;

public class DigitNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("The number of digits in " + n + " is: 1");
            return;
        }

        int count = 0;
        for (int temp = Math.abs(n); temp > 0; temp /= 10) {
            count++;
        }
        System.out.println("The number of digits in " + n + " is: " + count);
    }
}

