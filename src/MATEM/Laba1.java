package MATEM;

import java.util.Scanner;

public class Laba1 {


    public static double f(double x) {
        return Math.pow(x, 4) + 2 * Math.pow(x, 2) - 6 * x + 2;//функция, для которой ищем корень
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b, c, e, e1, fa, fc;
        int i = 0;
        String temp, flag;

        System.out.println("Введите границы отрезка [a,b]:");
        System.out.print("a = ");
        a = sc.nextDouble();
        System.out.print("b = ");
        b = sc.nextDouble();



        System.out.println("n\ta\tb\ten\tc\tf(a)\tf(c)\tусл1\tпримечание");

        e = 0.001; // заданная точность
        do {


            e1 = (b - a) / 2;
            c = (b + a) / 2;

            fa = f(a);
            fc = f(c);

            flag = "false";
            if (e1 <= e) {
                flag = "true";
            }
            System.out.printf("%d\t%.2f\t%.2f\t%.3f\t%.2f\t%.4f\t%.4f\t%s\t", i, a, b, e1, c, f(a), f(c), flag);
            i++;
            if (fa * fc <= 0) {
                b = c;
                temp = "b=c";
            } else {
                a = c;
                temp = "a=c";
            }
            System.out.printf("%s\n",temp);
        }while (e1 >= e);
    }
}
