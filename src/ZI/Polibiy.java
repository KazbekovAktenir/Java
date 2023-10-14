package ZI;

import java.util.Scanner;

public class Polibiy {
    private static final char[][] SQUARE = {
            {'A', 'B', 'C', 'D', 'E', 'F'},
            {'G', 'H', 'I', 'J', 'K', 'L'},
            {'M', 'N', 'O', 'P', 'Q', 'R'},
            {'S', 'T', 'U', 'V', 'W', 'X'},
            {'Y', 'Z', ' ', '.', ',', ';'},
            {'-', '?', '!', '(', ')', ':'}
    };
    public static void printSquare() {//для отображения квадрата Полибия на консоли
        System.out.println("Квадрат Полибия:");
        System.out.print("  ");
        for (int col = 1; col <= SQUARE[0].length; col++) {
            System.out.print(col + " ");
        }
        System.out.println();
        for (int row = 0; row < SQUARE.length; row++) {
            System.out.print(row + 1 + " ");
            for (int col = 0; col < SQUARE[row].length; col++) {
                System.out.print(SQUARE[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово для шифрования: ");
        String message = scanner.nextLine().toUpperCase();
        String encrypted = encrypt(message);
        System.out.println("Зашифрованное слово: " + encrypted);
        printSquare();
    }
    public static String encrypt(String message) { //
        StringBuilder encrypted = new StringBuilder();
        for (char ch : message.toCharArray()) {
            int[] indexes = findIndexes(ch);//для нахождения координат каждого символа
            if (indexes != null) {
                encrypted.append(indexes[0]).append(indexes[1]).append(" ");
            } else {
                encrypted.append(ch).append(" ");
            }
        }
        return encrypted.toString().trim();
    }
    private static int[] findIndexes(char ch) {
        for (int row = 0; row < SQUARE.length; row++) {
            for (int col = 0; col < SQUARE[row].length; col++) {
                if (SQUARE[row][col] == ch) {
                    return new int[]{row + 1, col + 1};
                }
            }
        }
        return null;
    }
}
