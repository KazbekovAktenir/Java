package MATEM;

import java.util.Scanner;

public class Lab_6 {
    public static double f1(double x) {
        double f;
        f = -Math.sqrt(20 * x - Math.pow(x, 2)) + 0.01 * Math.sin(x);
        return f;
    }

    public static double f2(double x) {
        double f;
        f = -(10 - x) / (Math.sqrt(20 * x - Math.pow(x, 2))) + 0.01 * Math.cos(x);
        return f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, exp, max, L;
        System.out.print("Введите a: ");
        a = scanner.nextDouble();
        System.out.print("Введите b: ");
        b = scanner.nextDouble();
        System.out.print("Введите e: ");
        exp = scanner.nextDouble();
        System.out.println();

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("a\tb  \t\te  \t\tL  \tf(a)  \tf(b)");
        if (f2(a) > f2(b)) {
            max = f2(a);
            L = max;
        } else {
            max = f2(b);
            L = max;
        }
        System.out.println(a + "\t" + b + "\t" + exp + "\t" + Math.round(L * 100) / 100.0 + "\t" +
                Math.round(f1(a) * 100) / 100.0 + "\t" + Math.round(f1(b) * 100) / 100.0);

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("f'(a)\tf'(b)\tmax  \tL");
        System.out.println(Math.round(f2(a) * 1000) / 1000.0 + "\t" + Math.round(f2(b) * 1000) / 1000.0 + "\t" +
                Math.round(max * 1000) / 1000.0 + "\t" + Math.round(L * 1000) / 1000.0);
        System.out.println("----------------------------------------------------------------------------------------------");

        double xn = (1 / (2 * L)) * (f1(a) - f1(b) + (L * (a + b)));
        double pn = 0.5 * (f1(a) + f1(b) + (L * (a - b)));
        double dn = (0.5 * L) * (f1(xn) - pn);
        double Ldn = 2 * (L * dn);
        double xn1 = xn - dn;
        double xn2 = xn + dn;
        double pn2 = 0.5 * (f1(xn) - pn);

        System.out.println("№\tx*n \tp*n \tf(x*n) \tdn  \tLdn \tx'n \tx''n \tpn  \tf(x'n)  \tf(x''n) \tПримечание");
        int i = 0;
        String pm = "false";
        while (pm.equals("false")) {
            if (Math.abs(f1(xn1) - f1(xn2)) <= L * Math.abs(xn1 - xn2)) {
                pm = "true";
            }
            System.out.println(i + "\t" + Math.round(xn * 1000) / 1000.0 + "\t" + Math.round(pn * 1000) / 1000.0 + "\t" +
                    Math.round(f1(xn) * 1000) / 1000.0 + "\t" + Math.round(dn * 1000) / 1000.0 + "\t" +
                    Math.round(Ldn * 1000) / 1000.0 + " \t" + Math.round(xn1 * 1000) / 1000.0 + "\t" +
                    Math.round(xn2 * 1000) / 1000.0 + "\t" + Math.round(pn2 * 1000) / 1000.0 + "\t" +
                    Math.round(f1(xn1) * 1000) / 1000.0 + " \t" + Math.round(f1(xn2) * 1000) / 1000.0 + " \t" + pm);
            i++;
        }
    }
}
