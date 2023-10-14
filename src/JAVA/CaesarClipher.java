package JAVA;

public class CaesarClipher {
    //функция для шифрования сообщения с использованием шифра Цезаря
    public static String encrypt(String message, int shift){
        
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++){
            char ch = message.charAt(i);

            if (Character.isLetter(ch)){
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) (base + (ch - base + shift) % 26);
            }
            result.append(ch);
        }
        return result.toString();
    }
    //функция для дешифрования сообщения, зашифрованного шифром Цезаря
    public static String decrypt(String message, int shift){
        return encrypt(message, 26 - shift);
    }
    public static void main(String[] args){
        String originalMessage = "Hello, World!";
        int shift = 3;

        //зашифровать сообщение
        String encryptedMessage = encrypt(originalMessage, shift);
        System.out.println("Зашифрованное сообщение: " + encryptedMessage);

        //Дешифровать сообщение
        String decryptedMessage = decrypt(encryptedMessage, shift);
        System.out.println("Дешифрованное сообщение: " + decryptedMessage);
    }
}
