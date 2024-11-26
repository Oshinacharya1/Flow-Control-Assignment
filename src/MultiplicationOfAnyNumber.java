import java.util.Scanner;

public class MultiplicationOfAnyNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to display its multiplication table: ");
            int n = scanner.nextInt();
            System.out.println("Multiplication table of " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + ( n * i ));
            }
        }
    }
