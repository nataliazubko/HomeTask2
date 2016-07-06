package HomeTask2;

import java.util.Scanner;

/**
 Имеется три стержня, на один из которых нанизаны N колец, причем кольца отличаются

 размером и лежат меньшее на большем. Требуется перенести пирамиду из N колец с одного

 стержня на другой за наименьшее число ходов. За один раз разрешается переносить только

 одно кольцо, причём нельзя класть большее кольцо на меньшее.
 *
 */


    public class Hanoi {

        public void solve(int n, String start, String auxiliary, String end) {
            if (n == 1) {
                System.out.println(start + " -> " + end);
            } else {
                solve(n - 1, start, end, auxiliary);
                System.out.println(start + " -> " + end);
                solve(n - 1, auxiliary, start, end);
            }
        }

        public static void main(String[] args) {
            Hanoi towersOfHanoi = new Hanoi();
            System.out.print("Enter number of discs: ");
            Scanner scanner = new Scanner(System.in);
            int discs = scanner.nextInt();
            towersOfHanoi.solve(discs, "A", "B", "C");
        }
    }

