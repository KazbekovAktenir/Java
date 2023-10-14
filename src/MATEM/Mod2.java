package MATEM;

//3
//import java.text.DecimalFormat;
//import java.util.function.Function;
//
//public class Mod2 {
//    public static void main(String[] args) {
//        double a = 0; // Начальная граница интервала
//        double b = 2; // Конечная граница интервала
//        double e = 0.01; // Точность округления
//        int n = 8; // Количество интервалов разбиения
//
//        double integral = integrate(a, b, e, n, Mod2::function);
//        printTable(a, b, e, n, integral);
//    }
//
//    // Функция, которую необходимо проинтегрировать
//    private static double function(double x) {
//        return Math.pow(x, 2) + 2 + Math.sqrt(x);
//    }
//
//    // Вычисление интеграла методом Симпсона
//    private static double integrate(double a, double b, double e, int n, Function<Double, Double> function) {
//        double h = (b - a) / n; // Шаг разбиения
//        double sum = function.apply(a) + function.apply(b); // Сумма значений на концах интервала
//        double integral = (h / 3) * sum; // Начальное значение интеграла
//        System.out.printf("%-10s %-15s %-15s %-15s\n", "Шаг", "Значение", "Приращение", "Интеграл");
//
//        for (int i = 1; i < n; i++) {
//            double x = a + i * h;
//            if (i % 2 == 0) {
//                sum += 2 * function.apply(x);
//            } else {
//                sum += 4 * function.apply(x);
//            }
//            double prevIntegral = integral;
//            integral = (h / 3) * sum;
//            double delta = integral - prevIntegral;
//            System.out.printf("%-10d %-15.5f %-15.5f %-15.5f\n", i, integral, delta, integral);
//            if (Math.abs(integral - e) <= e) { // Условие выхода из цикла
//                return integral;
//            }
//        }
//
//        return integral;
//    }
//
//    // Вывод таблицы результатов
//    private static void printTable(double a, double b, double e, int n, double integral) {
//        System.out.println("Интервал: [" + a + ", " + b + "]");
//        System.out.println("Точность: " + e);
//        System.out.println("Количество интервалов: " + n);
//        System.out.println("Результат вычисления интеграла: " + integral);
//    }
//}

//2
import java.text.DecimalFormat;

public class Mod2 {

    static DecimalFormat df = new DecimalFormat("#.######");

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
        System.out.println("================================================================================");
        System.out.println("x0\t        f(x0)\t         f'(x0)\t         f''(x0)\t     условие1");
        System.out.println("---------------------------------------------------------------------------------");
        int condition_a = (f_prime(a) * f_double_prime(a) > 0) ? 1 : 0;
        System.out.println(df.format(a) + "\t" + df.format(f(a)) + "\t" + df.format(f_prime(a)) + "\t" +
                df.format(f_double_prime(a)) + "\t" + condition_a);
        int condition_b = (f_prime(b) * f_double_prime(b) > 0) ? 1 : 0;
        System.out.println(df.format(b) + "\t" + df.format(f(b)) + "\t" + df.format(f_prime(b)) + "\t" +
                df.format(f_double_prime(b)) + "\t" + condition_b);
    }

    public static void print_table2(double x0, double x1) {
        System.out.println("\nTable 2: x0, x1");
        System.out.println("==========================================================================");
        System.out.println("x0\t          f(x0)\t           f'(x0)\t     x1");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(df.format(x0) + "\t" + df.format(f(x0)) + "\t" + df.format(f_prime(x0)) + "\t" +
                df.format(x1));
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
            System.out.print(i + "\t " + df.format(x0) + "\t " + df.format(fx0) + "\t " + df.format(fx0_prime) +
                    "\t " + df.format(x1_next) + "\t");
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
        double a = 0, b = 1, eps = 0.001;
        print_table1(a, b);
        double x0 = a, x1 = b;
        double root = solve_by_newton(x0, x1, eps);
        print_table2(x0, root);
    }
}