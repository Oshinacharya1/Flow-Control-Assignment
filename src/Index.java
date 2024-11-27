
import java.util.Scanner;

import static utils.Methods.printOddOrEven;
import static utils.Methods.printNaturalNumbersInReverse;
import static utils.Methods.isPrime;
import static utils.Methods.printPrimeNumbersUpToN;
import static utils.Methods.sumOfPrimesUpToN;
import static utils.Methods.isArmstrong;
import static utils.Methods.printArmstrongNumbersUpToN;
import static utils.Methods.isPerfect;
import static utils.Methods.printPerfectNumbersUpToN;

public class Index {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        printOddOrEven(false);
        printNaturalNumbersInReverse();
        int numberToCheck = 29;
        if (isPrime(numberToCheck)) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }

        numberToCheck = 50;
        if (isPrime(numberToCheck)) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }
        System.out.print("Enter a number (n) to find all prime numbers up to n: ");
        int n = scanner.nextInt();

        // Print all prime numbers up to n
        printPrimeNumbersUpToN(n);

        int sum = sumOfPrimesUpToN(n);
        System.out.println("The sum of all prime numbers between 1 and " + n + " is: " + sum);

        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int numberCheck = scanner.nextInt();
        if (isArmstrong(numberCheck)) {
            System.out.println(numberCheck + " is an Armstrong number.");
        } else {
            System.out.println(numberCheck + " is not an Armstrong number.");
        }
        System.out.print("Enter a number (n) to find all Armstrong numbers up to n: ");
        int armstrongLimit = scanner.nextInt();
        printArmstrongNumbersUpToN(armstrongLimit);

        System.out.print("Enter a number to check if it's a Perfect number: ");
        int perfectNumber = scanner.nextInt();
        if (isPerfect(perfectNumber)) {
            System.out.println(perfectNumber + " is a Perfect number.");
        } else {
            System.out.println(perfectNumber + " is not a Perfect number.");
        }
        System.out.print("Enter a number (n) to find all Perfect numbers up to n: ");
        int perfectLimit = scanner.nextInt();
        printPerfectNumbersUpToN(perfectLimit);
    }
}

