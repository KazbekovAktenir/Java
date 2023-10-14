package MATEM;

import java.lang.Math;
import java.util.Scanner;

public class Lab_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, e = 0.01, en, an, bn, x1n, x2n, fx1n, fx2n;
        int n = 1;
        System.out.print("Введите A: ");
        a = scanner.nextDouble();
        System.out.print("Введите B: ");
        b = scanner.nextDouble();

        boolean pr = false;
        an = a;
        bn = b;

        System.out.println("n\t   en\t       an\t       bn\t      x1n\t      x2n\t      fx1n\t      fx2n\t    pr");

        while (pr == false) {
            en = Math.pow((Math.sqrt(5) - 1) / 2, n) * (bn - an);
            x1n = an + (((3 - Math.sqrt(5)) / 2) * (bn - an));
            x2n = an + ((Math.sqrt(5) - 1) / 2) * (bn - an);
            fx1n = 3 * Math.pow(x1n, 4) - 10 * Math.pow(x1n, 3) + 21 * Math.pow(x1n, 2) + 12 * x1n;
            fx2n = 3 * Math.pow(x2n, 4) - 10 * Math.pow(x2n, 3) + 21 * Math.pow(x2n, 2) + 12 * x2n;

            if (en < e){
                pr = true;
            }

            System.out.printf("%d \t%.6f \t%.6f \t%.6f \t%.6f \t%.6f \t%.6f \t%.6f \t%b \n", n, en, an, bn, x1n, x2n, fx1n, fx2n, pr);

            if(fx1n>fx2n) {
                an = x1n;
            }
            else {
                bn = x2n;
            }
            n++;
        }
    }
}
