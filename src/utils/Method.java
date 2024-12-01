package utils;

public class Method {

    // Check if a number is a Strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    // Print all Strong numbers between 1 and n
    public static void printStrongNumbers(int n) {
        System.out.println("Strong numbers between 1 and " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (isStrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Swap first and last digit of a number
    public static int swapFirstAndLastDigit(int number) {
        String numStr = String.valueOf(number);
        if (numStr.length() < 2) return number;

        char[] numArray = numStr.toCharArray();
        char temp = numArray[0];
        numArray[0] = numArray[numArray.length - 1];
        numArray[numArray.length - 1] = temp;

        return Integer.parseInt(new String(numArray));
    }

    // Swap two values using a third variable
    public static void swapUsingThirdVariable(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    // Swap two values without using a third variable
    public static void swapWithoutThirdVariable(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    // Calculate power of a number without using pow method
    public static long calculatePower(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // Check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number, reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return reverse == originalNumber;
    }

    // Print Fibonacci series using for loop
    public static void printFibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Calculate frequency of digits in a number
    public static int[] digitFrequency(int number) {
        int[] frequency = new int[10];

        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        return frequency;
    }

    // Print ASCII characters and their values
    public static void printASCII() {
        System.out.println("ASCII Characters and Values:");
        for (int i = 0; i <= 127; i++) {
            System.out.println(i + " -> " + (char) i);
        }
    }

    // Print all alphabets (lowercase and uppercase)
    public static void printAlphabets(boolean uppercase) {
        if (uppercase) {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.print(ch + " ");
            }
        } else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.print(ch + " ");
            }
        }
        System.out.println();
    }

    // Print factors of a number
    public static void printFactors(int number) {
        System.out.print("Factors of " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Calculate HCF of two numbers
    public static int calculateHCF(int a, int b) {
        int hcf = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    // Calculate LCM of two numbers
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateHCF(a, b);
    }

    // Print prime factors of a number
    public static void printPrimeFactors(int number) {
        System.out.print("Prime factors of " + number + ": ");
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
        System.out.println();
    }

    // Calculate factorial of a digit
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
