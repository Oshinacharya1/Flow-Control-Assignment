package utils;

public class Methods {
    public static void printOddOrEven (boolean isOdd){
        System.out.println("Even numbers between 1 and 100 are:");
        for (int i = 1; i <= 100; i++) {
            if (isOdd){
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            } else {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }

            }

        }
    }
}
