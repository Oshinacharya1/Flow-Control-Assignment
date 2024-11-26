import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int temp = Math.abs(number); temp > 0; temp /= 10) {
            sum += temp % 10;
        }
        System.out.println("The sum of digits in " + number + " is: " + sum);
    }
}
