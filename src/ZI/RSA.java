package ZI;

import java.util.Scanner;

public class RSA{
    public static boolean checkPrimeNumber(int x) {
        boolean PrimeNumber = true;
        // 0 и 1 не являются простыми числами
        if (x == 0 || x == 1) {
            PrimeNumber = false;
        } else {
            for (int i = 2; i <= x / 2; ++i) {
                if (x % i == 0) {
                    PrimeNumber = false;
                    break;
                }
            }
        }
        return PrimeNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, q, n, f, e, d;

        System.out.print("Введите простое число p больше 1: ");
        p = input.nextInt();

        if (checkPrimeNumber(p))
            System.out.println(p + " — является простым числом.");
        else {
            System.out.println(p + " — не является простым числом.");
            System.out.print("Введите простое число p больше 1: ");
            p = input.nextInt();
        }
        System.out.println();

        System.out.print("Введите простое число q больше 1: ");
        q = input.nextInt();

        if (checkPrimeNumber(q))
            System.out.println(q + " — является простым числом.");
        else {
            System.out.println(q + " — не является простым числом.");
            System.out.print("Введите простое число q больше 1: ");
            q = input.nextInt();
        }
        System.out.println();

        n = p * q;
        System.out.println("Модуль p и q, n = " + n);

        f = (p - 1) * (q - 1);
        System.out.println("функция Эйлера, f = " + f);

        int[] ef = new int[f];
        for (int i = 0; i < f; i++) {
            ef[i] = i;
        }
        System.out.println();

        System.out.print("Выбор числа е: ");
        for (int i = 0; i < f; i++) {
            if (!checkPrimeNumber(ef[i]) || f % ef[i] == 0)
                ef[i] = 0;
            else
                System.out.print(ef[i] + " ");
        }
        System.out.println();

        System.out.print("Введите e = ");
        e = input.nextInt();

        if (checkPrimeNumber(e)) {
            System.out.println(e + " — является простым числом.");
        } else {
            System.out.println(e + " — не является простым числом.");
            System.out.print("Введите простое число enter_e больше 1: ");
            e = input.nextInt();
        }
        System.out.println();

        for (int i = 0; i < f; i++) {
            if (e == ef[i]) {
                break;
            }
        }
        System.out.println();

        System.out.println("Выбор числа d: ");
        int[] ed = new int[50];
        for (int i = 0; i < 50; i++) {
            ed[i] = i;
            if ((ed[i] * e) % f == 1)
                System.out.print(ed[i] + " ");
            else
                ed[i] = 0;
        }
        System.out.println();

        System.out.print("Введите d = ");
        d = input.nextInt();

        for (int i = 0; i < 50; i++) {
            if (d == ed[i]) {
                break;
            }
        }
        System.out.println();

        System.out.println("открытый ключ = [" + e + ";" + n + "]");
        System.out.println("закрытый ключ = [" + d + ";" + n + "]");

        input.close();
    }
}
