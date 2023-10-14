package Lab3Java;

import java.io.*;
import java.util.*;

public class Second {
    public static void main(String[] args) {
        try {
            File inputFile = new File("Список сотрудников.txt");
            Scanner scanner = new Scanner(inputFile);

            ArrayList<String> employees = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] employeeData = line.split(",");
                int experience = Integer.parseInt(employeeData[4].trim());

                if (experience > 10) {
                    double salary = Double.parseDouble(employeeData[5].trim());
                    double increasedSalary = salary * 1.2;
                    employeeData[5] = String.format("%.2f", increasedSalary);
                }

                employees.add(String.join(",", employeeData));
            }

            scanner.close();

            FileWriter writer = new FileWriter(inputFile);
            for (String employee : employees) {
                writer.write(employee + System.lineSeparator());
            }
            writer.close();

            System.out.println("Оклады сотрудников были увеличены на 20%.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
