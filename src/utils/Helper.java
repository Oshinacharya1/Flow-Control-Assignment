package utils;

import static utils.Method.*;
import java.util.Scanner;

public class Helper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a Strong number: ");
        int number = scanner.nextInt();
        System.out.println("Is Strong Number: " + isStrongNumber(number));

        System.out.print("Enter a range to print all Strong numbers: ");
        int range = scanner.nextInt();
        printStrongNumbers(range);

        System.out.print("Enter a number to swap its first and last digit: ");
        int numToSwap = scanner.nextInt();
        System.out.println("After swapping: " + swapFirstAndLastDigit(numToSwap));

        System.out.print("Enter two numbers to swap using a third variable: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        swapUsingThirdVariable(a, b);

        System.out.print("Enter two numbers to swap without a third variable: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        swapWithoutThirdVariable(a, b);

        System.out.print("Enter base and exponent for power calculation: ");
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        System.out.println("Power: " + calculatePower(base, exponent));

        System.out.print("Enter a number to check if it's a palindrome: ");
        int palindromeCheck = scanner.nextInt();
        System.out.println("Is Palindrome: " + isPalindrome(palindromeCheck));

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int terms = scanner.nextInt();
        printFibonacciSeries(terms);

        System.out.print("Enter a number to find digit frequencies: ");
        int freqNum = scanner.nextInt();
        int[] frequencies = digitFrequency(freqNum);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("Digit " + i + ": " + frequencies[i]);
        }

        printASCII();

        System.out.print("Print alphabets in uppercase? (true/false): ");
        boolean uppercase = scanner.nextBoolean();
        printAlphabets(uppercase);

        System.out.print("Enter a number to find its factors: ");
        int factorsNum = scanner.nextInt();
        printFactors(factorsNum);

        System.out.print("Enter two numbers to calculate HCF and LCM: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("HCF: " + calculateHCF(num1, num2));
        System.out.println("LCM: " + calculateLCM(num1, num2));

        System.out.print("Enter a number to find its prime factors: ");
        int primeFactorsNum = scanner.nextInt();
        printPrimeFactors(primeFactorsNum);
    }
}

