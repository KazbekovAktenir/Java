package MATEM;

import java.util.Scanner;

public class LAB3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, e, fa, x0;
        double[] fx0 = new double[2];
        double[] f1x0 = new double[2];
        double [] x10 = new double[2];

        System.out.println("Введите a:");
        a = scanner.nextDouble();

        System.out.println("Введите b:");
        b = scanner.nextDouble();

        System.out.println("Введите e:");
        e = scanner.nextDouble();

        x10 = new double[]{a, b};
        fa = Math.pow(a, 4) + 2 * Math.pow(a, 2) - 6 * a + 2;
        double fb = Math.pow(b, 4) + 2 * Math.pow(b, 2) - 6 * b + 2;
        System.out.println("ab\tf'(x)\tf''(x)\tусл");
        for (int i = 0; i < 2; i++) {
            fx0[i] = 4 * Math.pow(x10[i], 3) + 4 * x10[i] - 6;
            f1x0[i] = 12 * Math.pow(x10[i], 2) + 4;
            System.out.println(x10[i] + "\t" + fx0[i] + "\t" + f1x0[i]);
        }
        double fx, fx1, fx2, x1;
        boolean a1;
        int i = 1;
        if (fx0[0] * f1x0[0] > 0 && fx0[1] * f1x0[1] > 0) {
            x0 = a;
            System.out.println("x0=a");
            fx = Math.pow(x0, 4) + 2 * Math.pow(x0, 2) - 6 * x0 + 2;
            fx1 = 4 * Math.pow(x0, 3) + 4 * x0 - 6;
            x1 = x0 - (fx * (b - x0)) / (fb - fx);
            x1 = Math.round(x1 * 10000) / 10000.0;
            x0 = x1;
            if (Math.abs(x0 - x1) < e) a1 = true;
            else a1 = false;
            i++;
            System.out.println("№\t x0\t   f(x)\t   f'(x)\t   x1\t  усл");
            System.out.println(i + "\t" + x0 + "\t" + fx + "\t" + fx1 + "\t" + x1 + "\t" + a1);
            while (a1 == false) {
                fx = Math.pow(x0, 4) + 2 * Math.pow(x0, 2) - 6 * x0 + 2;
                fx = Math.round(fx * 10000) / 10000.0;
                fx1 = 4 * Math.pow(x0, 3) + 4 * x0 - 6;
                fx1 = Math.round(fx1 * 10000) / 10000.0;
                x1 = x0 - (fx * (b - x0)) / (fb - fx);
                x1 = Math.round(x1 * 10000) / 10000.0;
                if (Math.abs(x0 - x1) < e) a1 = true;
                else a1 = false;
                System.out.println(i + "\t" + x0 + "\t" + fx + "\t" + fx1 + "\t" + x1 + "\t" + a1);
                i++;
                x0 = x1;
            }
        } else {
            x0 = b;
            System.out.println("x0=b");
            fx = Math.pow(x0, 4) + 2 * Math.pow(x0, 2) - 6 * x0 + 2;
            fx1 = 4 * Math.pow(x0, 3) + 4 * x0 - 6;
            x1 = x0 - (fx * (x0 - a)) / (fx - fa);
            x1 = Math.round(x1 * 10000) / 10000.0;
            if (Math.abs(x0 - x1) < e) a1 = true;
            else a1 = false;
            System.out.println("№\t x0\t   f(x)\t   f'(x)\t   x1\t  усл");
            System.out.println(i + "\t" + x0 + "\t" + fx + "\t" + fx1 + "\t" + x1 + "\t" + a1);
            x0 = x1;
            i++;
            while (a1 == false) {
                fx = Math.pow(x0, 4) + 2 * Math.pow(x0, 2) - 6 * x0 + 2;
                fx = Math.round(fx * 10000) / 10000.0;
                fx1 = 4 * Math.pow(x0, 3) + 4 * x0 - 6;
                fx1 = Math.round(fx1 * 10000) / 10000.0;
                x1 = x0 - (fx * (x0 - a)) / (fx - fa);
                x1 = Math.round(x1 * 10000) / 10000.0;
                if (Math.abs(x0 - x1) < e) a1 = true;
                else a1 = false;
                System.out.println(i + "\t" + x0 + "\t" + fx + "\t" + fx1 + "\t" + x1 + "\t" + a1);
                x0 = x1;
                i++;
            }
        }
    }
}
