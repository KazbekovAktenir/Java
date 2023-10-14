package Lab3Java;

import java.io.*;
import java.util.*;

public class Fifth {
    public static void main(String[] args) {
        try {
            File employeesFile = new File("Список сотрудников.txt");
            File reductionFile = new File("Сокращение.txt");

            ArrayList<String> reducedEmployees = new ArrayList<>();

            Scanner employeesScanner = new Scanner(employeesFile);
            while (employeesScanner.hasNextLine()) {
                String line = employeesScanner.nextLine();
                String[] employeeData = line.split(",");
                String surname = employeeData[0].trim();

                Scanner reductionScanner = new Scanner(reductionFile);
                boolean found = false;
                while (reductionScanner.hasNextLine()) {
                    String reductionLine = reductionScanner.nextLine();
                    String[] reductionData = reductionLine.split(",");
                    String reductionSurname = reductionData[0].trim();

                    if (reductionSurname.equalsIgnoreCase(surname)) {
                        found = true;
                        break;
                    }
                }
                reductionScanner.close();

                if (!found) {
                    reducedEmployees.add(line);
                }
            }
            employeesScanner.close();

            FileWriter writer = new FileWriter(employeesFile);
            for (String employee : reducedEmployees) {
                writer.write(employee + System.lineSeparator());
            }
            writer.close();

            System.out.println("Сотрудники, указанные в файле 'Сокращение', были удалены из файла 'Список сотрудников'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

