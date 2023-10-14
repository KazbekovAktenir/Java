package MATEM;

import java.util.Scanner;

public class Proizvodnye1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите точку X: ");
        double x = scanner.nextDouble();

        System.out.println("Введите шаг h: ");
        double h = scanner.nextDouble();

        //вычисление приближенного значения производной с помощью правой разностной формулы
        double rightProizvod = (f(x + h) - f(x)) / h;

        //вычисление точного значения производной в точке x=1
        double tochPtroizvod = fPrime(x);

        System.out.println("приближенное значение производной: " + rightProizvod);
        System.out.println("точное значение производной в точке x=1: " + tochPtroizvod);

        //абсолютная погрешность
        double absoluteError = Math.abs(rightProizvod - tochPtroizvod);
        System.out.println("абсолютная погрешность: " + absoluteError);

        //относительная погрешность
        double relativeError = Math.abs(absoluteError / tochPtroizvod);
        System.out.println("относительная погрешность: " + relativeError);
    }

    //функция f(x) = -x^3 - 2x + 7
    public static double f(double x) {
        return -Math.pow(x, 3) - 2 * x + 7;
    }

    //точное значение производной функции f'(x) = -3x^2 - 2
    public static double fPrime(double x) {
        return -3 * Math.pow(x, 2) - 2;
    }
}

