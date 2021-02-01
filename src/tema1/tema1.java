package tema1;

import java.util.Scanner;

public class tema1 {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите X(число):");
            double x = scan.nextDouble();
            System.out.print("Введите B (число, более нуля):");
            double a = scan.nextDouble();
            System.out.print("Введите D(число, более нуля):");
            double b = scan.nextDouble();
            double y;

            if (x >= 6) {
                y = 4 * ((Math.pow(a, 2)) + 2 * x + (Math.pow(b, 2))) / (a * b);
            } else {
                y = (Math.pow(x, 3)) * ((a - b) * (a - b));
            }

            System.out.format("Y=%.3f", y);
            // System.out.print("Y="+y);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Входные параметры заданы неверно!");
        }

    }
}
