package Lab3Java;

import java.io.*;
import java.util.*;

public class Fourth {
    public static void main(String[] args) {
        try {
            File inputFile = new File("Список сотрудников.txt");
            File outputFile = new File("Сокращение.txt");

            Scanner scanner = new Scanner(inputFile);
            FileWriter writer = new FileWriter(outputFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] employeeData = line.split(",");
                String education = employeeData[2].trim();

                if (!education.equalsIgnoreCase("Высшее")) {
                    writer.write(line + System.lineSeparator());
                }
            }

            scanner.close();
            writer.close();

            System.out.println("Значения о сотрудниках без высшего образования были скопированы в файл 'Сокращение'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}