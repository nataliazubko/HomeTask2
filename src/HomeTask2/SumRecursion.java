package HomeTask2;

import java.util.Scanner;

/**
 * Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму

 чисел от 1 до n;
 */
public class SumRecursion {

    public static int sum(int number){

if (number >1)
    return number + sum(number-1);
       else
    return number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt();
        System.out.println(sum(number));
    }

}
