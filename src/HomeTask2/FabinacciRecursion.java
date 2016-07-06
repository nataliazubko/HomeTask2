package HomeTask2;

/**
 * Created by 1 on 29.06.2016.
 *
 * Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элемент

 последовательности Фибоначчи для вычисления пятнадцатого элемента.
 */
public class FabinacciRecursion {
    static int counter = 1;
    public static  int fib(int number){

        if (number ==1|| number ==2){
            return 1;
        }
        else if (number ==4){

            System.out.println(counter++);
            return fib(number-1)+fib(number-2);
        }
        else return fib(number-1)+fib(number-2);
    }

    public static void main(String[] args) {
fib(15);

    }
}
