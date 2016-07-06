package HomeTask2;

/**
 *
 * Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из

 отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с

 наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести

 индекс первой встретившейся из них.

 */
public class MaxProduct {
    public static void main(String[] args) {
        int [][]mass = new int[7][4];
      int []product =new int[mass.length] ;

        for (int i = 0; i<7;i++){
            System.out.print("Строка №"+i+" ");
            for(int j = 0; j<4; j++){
                mass[i][j]= -5+(int)(Math.random()*10+1);
                System.out.print(mass[i][j]+" \t");
                if(j==0)product[i]=mass[i][j];
                else product [i] *= mass[i][j];

            }
            System.out.println(" ");
        }
        int max =0;
        int max1 =0;
        for(int i =0; i<product.length;i++){
            if (Math.abs(product[i])>max){
                max=product[i];
                max1=i;
            }
        }
        System.out.println("Строка с наибольшим по модулю произведением элементов ("+max+") имеет индекс - "+max1);


    }

}



