package HomeTask2;

/**
 * Created by 1 on 15.06.2016.
 * Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что

 первый и второй члены последовательности равны единицам, а каждый следующий — сумме

 двух предыдущих.
 */
public class FabinacciSecuence {
    public static void main(String[] args) {
        int first = 1;
        int second  =1;
        int[]mass = new int[11];
        for(int i =0; i<11;i++){
            mass[0] =1;
            mass[1] =1;
            if(i>=2)
            mass[i]=mass[i-1]+mass[i-2];
            System.out.print(mass[i]+" ");
        }
    }
}
