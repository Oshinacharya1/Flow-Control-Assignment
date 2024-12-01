package utils;

public class Methods {
    public static void printOddOrEven(boolean isOdd) {
        System.out.println("Even numbers between 1 and 100 are:");
        for (int i = 1; i <= 100; i++) {
            if (isOdd) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            } else {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }

    public static void printNaturalNumbersInReverse() {
        System.out.println("Natural numbers from 100 to 1 are:");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }
        return true; // Prime number
    }

    public static void printPrimeNumbersUpToN(int n) {
        System.out.println("Prime numbers between 1 and " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int sumOfPrimesUpToN(int n) {
        int sum = 0; // Initialize sum
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i; // Add the prime number to the sum
            }
        }
        return sum; // Return the final sum
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length(); // Find the number of digits

        // Calculate the sum of each digit raised to the power of digits
        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, digits);
            number /= 10;
        }

        // Compare the sum to the original number
        return sum == originalNumber;
    }

    public static void printArmstrongNumbersUpToN(int n) {
        System.out.println("Armstrong numbers between 1 and " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPerfect(int number) {
        int sum = 0;

        // Find all proper divisors and calculate their sum
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
    public static void printPerfectNumbersUpToN(int n) {
        System.out.println("Perfect numbers between 1 and " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    private static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}

