package ZI;
import java.util.Scanner;

public class LB_3 {
    private static final char[][] POLYBIUS_TABLE = {
            {'A', 'B', 'C', 'D', 'E'},
            {'F', 'G', 'H', 'I', 'K'},
            {'L', 'M', 'N', 'O', 'P'},
            {'Q', 'R', 'S', 'T', 'U'},
            {'V', 'W', 'X', 'Y', 'Z'}
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Исходный текст: ");
        String plaintext = input.nextLine();
        String ciphertext = encrypt(plaintext);
        System.out.println("Зашифрованный текст: " + ciphertext);

        String shiftedCiphertext = shiftLeft(ciphertext);
        System.out.println("Циклический сдвиг влево на одну позицию: " + shiftedCiphertext);

        String spacedCiphertext = addSpaces(shiftedCiphertext);
        System.out.println("Разделенный текст с циклическим сдвигом: " + spacedCiphertext);


    }

    public static String encrypt(String plaintext) {
        plaintext = plaintext.toUpperCase().replaceAll("[^A-Z]", "");
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            int[] indexes = getIndexes(c);
            ciphertext.append(indexes[0]).append(indexes[1]);
        }
        return ciphertext.toString();
    }



    public static String shiftLeft(String ciphertext) {
        char firstChar = ciphertext.charAt(0);
        return ciphertext.substring(1) + firstChar;
    }

    public static String addSpaces(String ciphertext) {
        StringBuilder spacedCiphertext = new StringBuilder();
        for (int i = 0; i < ciphertext.length(); i += 2) {
            spacedCiphertext.append(ciphertext.charAt(i)).append(ciphertext.charAt(i + 1)).append(" ");
        }
        return spacedCiphertext.toString().trim();
    }

    private static int[] getIndexes(char c) {
        int[] indexes = new int[2];
        for (int i = 0; i < POLYBIUS_TABLE.length; i++) {
            for (int j = 0; j < POLYBIUS_TABLE[i].length; j++) {
                if (POLYBIUS_TABLE[i][j] == c) {
                    indexes[0] = i + 1;
                    indexes[1] = j + 1;
                    return indexes;
                }
            }
        }
        return indexes;
    }
}
