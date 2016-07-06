package HomeTask2;

import java.util.Scanner;

/**
 *
 * Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его

 цифр (заранее не известно сколько цифр будет в числе).
 *
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();



        int sum = 0;
        while ( number!=0){

                sum = sum + (number%10);
                number = number/10;
            }
            System.out.print(sum + " ");

        }

    }

