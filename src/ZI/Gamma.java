package ZI;

//import java.util.Scanner;
//
//public class Gamma {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int p, q;
//
//        while (true) {
//            System.out.print("Введите значение p: ");
//            p = scanner.nextInt();
//            if (isPrime(p) && p % 4 == 3) {
//                break;
//            } else {
//                System.out.println("Значение p должно быть простым числом с остатком 3 при делении на 4!");
//            }
//        }
//
//        while (true) {
//            System.out.print("Введите значение q: ");
//            q = scanner.nextInt();
//            if (isPrime(q) && q % 4 == 3) {
//                break;
//            } else {
//                System.out.println("Значение q должно быть простым числом с остатком 3 при делении на 4!");
//            }
//        }
//
//        System.out.print("Введите начальное значение x: ");
//        int x = scanner.nextInt();
//        System.out.print("Введите длину последовательности: ");
//        int length = scanner.nextInt();
//        int n = p * q;
//
//        int[] gamma = new int[length];
//        System.out.print("Ключ: ");
//        for (int i = 0; i < length; i++) {
//            x = x * x % n;
//            gamma[i] = x % 2;
//            System.out.print(gamma[i]);
//        }
//        System.out.println();
//
//        scanner.nextLine(); // очищаем буфер после ввода числа
//        System.out.print("Введите слово для шифрования: ");
//        String word = scanner.nextLine();
//        StringBuilder encrypted = new StringBuilder();
//        for (int i = 0; i < word.length(); i++) {
//            int c = (int) word.charAt(i);
//            int cBinary = Integer.parseInt(Integer.toBinaryString(c));
//            int e = cBinary ^ gamma[i % length];
//            System.out.print("Символ '" + word.charAt(i) + "': " + Integer.toBinaryString(c) + " -> XOR -> " + gamma[i % length] + " = " + e + " -> ");
//            char encryptedChar = (char) Integer.parseInt(String.valueOf(e), 2);
//            System.out.println("'" + encryptedChar + "' (" + Integer.toBinaryString(encryptedChar) + ")");
//            encrypted.append(encryptedChar);
//        }
//        System.out.println("Зашифрованное слово: " + encrypted.toString());
//
//        scanner.close();
//    }
//
//    public static boolean isPrime(int num) {
//        if (num == 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}



//package ZI;
//
//import java.util.Scanner;
//
//public class Gamma {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int p, q;
//
//        while (true) {
//            System.out.print("Введите значение p: ");
//            p = scanner.nextInt();
//            if (isPrime(p) && p % 4 == 3) {
//                break;
//            } else {
//                System.out.println("Значение p должно быть простым числом с остатком 3 при делении на 4!");
//            }
//        }
//
//        while (true) {
//            System.out.print("Введите значение q: ");
//            q = scanner.nextInt();
//            if (isPrime(q) && q % 4 == 3) {
//                break;
//            } else {
//                System.out.println("Значение q должно быть простым числом с остатком 3 при делении на 4!");
//            }
//        }
//
//        System.out.print("Введите начальное значение x: ");
//        int x = scanner.nextInt();
//        System.out.print("Введите длину последовательности: ");
//        int length = scanner.nextInt();
//        int n = p * q;
//
//        int[] gamma = new int[length];
//        System.out.print("Ключ: ");
//        for (int i = 0; i < length; i++) {
//            x = x * x % n;
//            gamma[i] = x % 2;
//            System.out.printf("x[%d] = %d (%s)%n", i, x, Integer.toBinaryString(x));
//            System.out.print(gamma[i]);
//        }
//        System.out.println();
//
//        scanner.nextLine(); // очищаем буфер после ввода числа
//        System.out.print("Введите слово для шифрования: ");
//        String word = scanner.nextLine();
//        StringBuilder encrypted = new StringBuilder();
//        for (int i = 0; i < word.length(); i++) {
//            int c = (int) word.charAt(i);
//            int cBinary = Integer.parseInt(Integer.toBinaryString(c));
//            int e = cBinary ^ gamma[i];
//            System.out.print("Символ '" + word.charAt(i) + "': " + Integer.toBinaryString(c) + " -> XOR -> " + gamma[i] + " = " + e + " -> ");
//            char encryptedChar = (char) Integer.parseInt(String.valueOf(e), 2);
//            System.out.println("'" + encryptedChar + "' (" + Integer.toBinaryString(encryptedChar) + ")");
//            encrypted.append(encryptedChar);
//        }
//        System.out.println("Зашифрованное слово: " + encrypted.toString());
//
//        scanner.close();
//    }
//        public static boolean isPrime(int num) {
//        if (num == 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}

import java.util.Scanner;

public class Gamma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p, q;

        while (true) {
            System.out.print("Введите значение p: ");
            p = scanner.nextInt();
            if (isPrime(p) && p % 4 == 3) {
                break;
            } else {
                System.out.println("Значение p должно быть простым числом с остатком 3 при делении на 4!");
            }
        }

        while (true) {
            System.out.print("Введите значение q: ");
            q = scanner.nextInt();
            if (isPrime(q) && q % 4 == 3) {
                break;
            } else {
                System.out.println("Значение q должно быть простым числом с остатком 3 при делении на 4!");
            }
        }

        System.out.print("Введите начальное значение x: ");
        int x = scanner.nextInt();
        System.out.print("Введите длину последовательности: ");
        int length = scanner.nextInt();
        int n = p * q;

        int[] gamma = new int[length];
        System.out.print("Ключ: ");
        for (int i = 0; i < length; i++) {
            x = x * x % n;
            gamma[i] = x % 2;
            System.out.printf("x[%d] = %d (%s)%n", i, x, Integer.toBinaryString(x));
            System.out.print(gamma[i]);
        }
        System.out.println();

        scanner.nextLine(); // очищаем буфер после ввода числа
        System.out.print("Введите слово для шифрования: ");
        String word = scanner.nextLine();
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int c = (int) word.charAt(i);
            int cBinary = Integer.parseInt(Integer.toBinaryString(c));
            int gBinary = gamma[i % length];
            int e = cBinary ^ gBinary;
            System.out.print("Символ '" + word.charAt(i) + "': " + Integer.toBinaryString(c) + " -> XOR -> " + gBinary + " = " + e + " -> ");
            char encryptedChar = (char) Integer.parseInt(String.valueOf(e), 2);
            System.out.println("'" + encryptedChar + "' (" + Integer.toBinaryString(encryptedChar) + ")");
            encrypted.append(encryptedChar);
        }
        System.out.println("Зашифрованное слово: " + encrypted.toString());

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}





