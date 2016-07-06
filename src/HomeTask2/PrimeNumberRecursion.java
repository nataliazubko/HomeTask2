package HomeTask2;

import java.util.Scanner;

/**
 * Создайте код, который выводит все простые числа из интервала от 2 до n (заданного с

 клавиатуры). Результат должен быть: 2,3,5,7 ...
 */
public class PrimeNumberRecursion {


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isPrimes(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimes(int n) {
        if ((n == 2) ||
                (n == 3) ||
                (n == 5) ||
                (n == 7)) {
            return true;
        }

        if ((n % 2 == 0) ||
                (n% 3 == 0) ||
                (n % 5 == 0) ||
                (n% 7 == 0)) {
            return false;
        }

        return true;
    }

    }
