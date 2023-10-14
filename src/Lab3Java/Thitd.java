package Lab3Java;

import java.io.*;

public class Thitd {
    public static void main(String[] args) {
        try {
            File inputFile = new File("Список сотрудников.txt");
            File outputFile = new File("Новый файл.txt");

            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile);

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            reader.close();
            writer.close();

            System.out.println("Файл был успешно скопирован.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

