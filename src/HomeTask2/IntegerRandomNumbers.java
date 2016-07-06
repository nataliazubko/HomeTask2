package HomeTask2;

/**
 * Created by 1 on 15.06.2016.
 *
 * Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из

 отрезка [10;99]. Вывести массив на экран.
 */
public class IntegerRandomNumbers {
    public static void main(String[] args) {
        int[][] massive = new int[8][5];

        for (int i =0; i<8; i++ ){

            for(int j = 0; j<5 ;j++)
            {
                massive[i][j] = 10 + (int)(Math.random() * ((99 - 10) + 1));
                System.out.print(massive[i][j]+ "\t");
            }
            System.out.println(" ");
        }

    }
}
