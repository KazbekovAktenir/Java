package MATEM;

public class Proizvodnye {
    public static void main(String[] args) {
        double x = 1.0;
        double a = 1.0;

        System.out.println("---------- Функция 1 ----------");
        System.out.println("f' = " + derivative1(x));
        System.out.println("f'' = " + derivative2(x));

        System.out.println("---------- Функция 2 ----------");
        System.out.println("f' = " + derivative3(x, a));
        System.out.println("f'' = " + derivative4(x, a));

        System.out.println("---------- Функция 3 ----------");
        System.out.println("f' = " + derivative5(x));
        System.out.println("f'' = " + derivative6(x));

        System.out.println("---------- Функция 4 ----------");
        System.out.println("f' = " + derivative7(x));
        System.out.println("f'' = " + derivative8(x));
    }

    public static double function1(double x) {
        return ((Math.pow(x, 2) - 2) * Math.sqrt(4 + Math.pow(x, 2))) / (24 * Math.pow(x, 3));
    }

    public static double derivative1(double x) {
        double h = 0.001;
        return (function1(x + h) - function1(x)) / h;
    }

    public static double derivative2(double x) {
        double h = 0.001;
        return (function1(x + h) - 2 * function1(x) + function1(x - h)) / Math.pow(h, 2);
    }

    public static double function2(double x, double a) {
        return x + (1 / Math.sqrt(2)) * Math.log1p((x - Math.sqrt(2)) / (x + Math.sqrt(2))) + Math.pow(a, Math.PI) * Math.sqrt(2);
    }

    public static double derivative3(double x, double a) {
        double h = 0.001;
        return (function2(x + h, a) - function2(x, a)) / h;
    }

    public static double derivative4(double x, double a) {
        double h = 0.001;
        return (function2(x + h, a) - 2 * function2(x, a) + function2(x - h, a)) / Math.pow(h, 2);
    }

    public static double function3(double x) {
        return Math.pow(x, Math.pow(Math.E, Math.cos(x)));
    }

    public static double derivative5(double x) {
        double h = 0.001;
        return (function3(x + h) - function3(x)) / h;
    }

    public static double derivative6(double x) {
        double h = 0.001;
        return (function3(x + h) - 2 * function3(x) + function3(x - h)) / Math.pow(h, 2);
    }

    public static double function4(double x) {
        return (x + 2) / (Math.pow(x, 2) + 4 * x + 6) + (1 / Math.sqrt(2)) * Math.atan((x + 2) / Math.sqrt(2));
    }

    public static double derivative7(double x) {
        double h = 0.001;
        return (function4(x + h) - function4(x)) / h;
    }


    public static double derivative8(double x) {
        double h = 0.001;
        return (function4(x + h) - 2 * function4(x) + function4(x - h)) / Math.pow(h, 2);
    }
}
