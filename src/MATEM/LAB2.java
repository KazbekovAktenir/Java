package MATEM;

import java.util.Scanner;

public class LAB2 {

    public static double f(double x) {
        return Math.pow(x, 4) + 2 * Math.pow(x, 2) - 6 * x + 2;
    }

    public static double f_prime(double x) {
        return 4 * Math.pow(x, 3) + 4 * x - 6;
    }

    public static double f_double_prime(double x) {
        return 12 * Math.pow(x, 2) + 4;
    }

    public static void print_table1(double a, double b) {
        System.out.println("Table 1: x0 = a, x0 = b");
        System.out.println("========================================================================");
        System.out.println("x0\t        f(x0)\t     f'(x0)\t   f''(x0)\t    условие1");
        System.out.println("------------------------------------------------------------------------");
        int condition_a = (f_prime(a) * f_double_prime(a) > 0) ? 1 : 0;
        System.out.printf("%1f \t%.5f \t%.5f \t%.5f \t%b \t", a, f(a), f_prime(a), f_double_prime(a), condition_a);
        System.out.println();
        int condition_b = (f_prime(b) * f_double_prime(b) > 0) ? 1 : 0;
        System.out.printf("%1f \t%.5f \t%.5f \t%.5f \t%b \t", b, f(b), f_prime(b), f_double_prime(b), condition_b);
        System.out.println();
    }

    public static void print_table2(double x0, double x1) {
        System.out.println("\nTable 2: x0, x1");
        System.out.println("===================================================");
        System.out.println("x0\t        f(x0)\t     f'(x0)\t    x1");
        System.out.println("---------------------------------------------------");
        System.out.printf("%2f \t%.6f  \t%.6f  \t%b \t", x0, f(x0), f_prime(x0), x1);

    }

    public static double solve_by_newton(double a, double b, double eps) {
        double x0 = a;
        double x1 = b;
        int i = 0;
        System.out.println("\nIter\t x0\t\t f(x0)\t\t f'(x0)\t\t x1\t\t cond2");
        System.out.println("---------------------------------------------------------------------------------");
        do {
            double fx0 = f(x0);
            double fx0_prime = f_prime(x0);
            double x1_next = x0 - fx0 / fx0_prime;
            System.out.printf("%d \t%.6f \t%.6f \t%.6f \t%b \t", i, x0, fx0, fx0_prime, x1_next);
            if (Math.abs(x1_next - x1) < eps) {
                System.out.println("true");
                break;
            }
            else {
                System.out.println("false");
            }
            x1 = x1_next;
            x0 = x1;
            i++;
        } while (true);
        return x1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите значение eps: ");
        double eps = scanner.nextDouble();

        scanner.close();

        print_table1(a, b);
        double x0 = a, x1 = b;
        double root = solve_by_newton(x0, x1, eps);
        print_table2(x0, root);
    }
}