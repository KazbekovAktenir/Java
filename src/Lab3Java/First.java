package Lab3Java;

import java.io.*;
import java.util.*;

public class First {
    public static void main(String[] args) {
        try {
            File inputFile = new File("Список сотрудников.txt");
            Scanner scanner = new Scanner(inputFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] employeeData = line.split(",");
                String position = employeeData[3].trim();

                File outputFile = new File(position + ".txt");
                FileWriter writer = new FileWriter(outputFile, true);
                writer.write(line + System.lineSeparator());
                writer.close();
            }

            scanner.close();
            System.out.println("Сотрудники были переписаны в соответствующие файлы.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

