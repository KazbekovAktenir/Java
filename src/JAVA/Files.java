package JAVA;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        try {
            // Создание файла "Список сотрудников" и заполнение данными
            File employees = new File("Список сотрудников.txt");
            FileWriter employWriter = new FileWriter(employees);
            employWriter.write("Фамилия И.О.,Дата рождения,Образование,Должность,Стаж,Оклад\n");
            employWriter.write("Иванов Иван Иванович,01.01.1980,Высшее,Менеджер,15,50000\n");
            employWriter.write("Петров Петр Петрович,05.05.1985,Среднее,Бухгалтер,8,40000\n");
            employWriter.write("Сидоров Сидор Сидорович,10.10.1990,Высшее,Аналитик,12,60000\n");
            employWriter.close();

            //cоздание файлов по должностям
            File inputFile = new File("Список сотрудников.txt");
            Scanner scanner = new Scanner(employees);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("Фамилия")) {
                    continue; //пропуск заголовка
                }
                String[] employData = line.split(",");//разделяет строку line на подстроки, используя запятую , в качестве разделителя
                String position = employData[3].trim();//извлекается должность сотрудника из массива по индексу 3

                File outputFile = new File(position + ".txt");//для создания файла по названию должности
                FileWriter writer = new FileWriter(outputFile, true);
                writer.write(line + System.lineSeparator());//чтобы каждая запись располагалась на отдельной строке
                writer.close();
            }
            scanner.close();
            System.out.println("Информация о сотрудниках была переписана в соответствующие файлы по должностям.");

            //нахождение сотрудников со стажем более 10 лет и увеличение их оклада на 20%
            scanner = new Scanner(inputFile);
            ArrayList<String> updatedEmployees = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("Фамилия")) {
                    updatedEmployees.add(line); //сохранение заголовка
                    continue;
                }
                String[] employeeData = line.split(",");
                int experience = Integer.parseInt(employeeData[4].trim());

                if (experience > 10) {//проверяется превышает ли стаж сотрудника 10 лет
                    double salary = Double.parseDouble(employeeData[5].trim());//строковое значение оклада преобразуется в double
                    double increasedSalary = salary * 1.2;//увеличение оклада на 20%
                    employeeData[5] = String.format("%.2f", increasedSalary);
                }

                updatedEmployees.add(String.join(",", employeeData));
            }
            scanner.close();

            File updatedFile = new File("Список сотрудников (обновленный).txt");
            FileWriter updatedWriter = new FileWriter(updatedFile);
            for (String employee : updatedEmployees) {
                updatedWriter.write(employee + System.lineSeparator());
            }
            updatedWriter.close();

            System.out.println("Оклады сотрудников со стажем более 10 лет были увеличены на 20%.");
            System.out.println("До увеличения окладов:");
            scanner = new Scanner(employees);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();

            System.out.println("\nПосле увеличения окладов:");
            scanner = new Scanner(updatedFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();

            //копирование содержимого файла "Список сотрудников" в новый файл
            File newFile = new File("Новый файл.txt");
            FileReader fileReader = new FileReader(employees);
            FileWriter fileWriter = new FileWriter(newFile);

            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            fileReader.close();
            fileWriter.close();

            System.out.println("Содержимое файла 'Список сотрудников' было скопировано в файл 'Новый файл'.");

            //копирование значений о сотрудниках без высшего образования в файл "Сокращение"
            File reductionFile = new File("Сокращение.txt");
            FileWriter reductionWriter = new FileWriter(reductionFile);

            scanner = new Scanner(employees);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("Фамилия")) {
                    continue; //пропуск заголовка
                }
                String[] employeeData = line.split(",");
                String education = employeeData[2].trim();

                if (!education.equalsIgnoreCase("Высшее")) {//проверяется не равна ли строковая переменная education строке "Высшее"
                    reductionWriter.write(line + System.lineSeparator());
                }
            }
            scanner.close();
            reductionWriter.close();

            System.out.println("Значения о сотрудниках без высшего образования были скопированы в файл 'Сокращение'.");

            //удаление сотрудников из файла "Список сотрудников", чьи фамилии присутствуют в файле "Сокращение"
            ArrayList<String> remainingEmployees = new ArrayList<>();

            scanner = new Scanner(employees);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("Фамилия")) {
                    remainingEmployees.add(line); // Сохранение заголовка
                    continue;
                }
                String[] employeeData = line.split(",");
                String surname = employeeData[0].trim();

                File tempFile = new File("temp.txt");
                FileWriter tempWriter = new FileWriter(tempFile, true);

                boolean found = false;
                Scanner redScanner = new Scanner(reductionFile);
                while (redScanner.hasNextLine()) {//redScanner проверяет, есть ли еще строки в файле "Сокращение.txt"
                    String reducLine = redScanner.nextLine();//если в файле есть следующая строка, она считывается с помощью метода nextLine() и сохраняется в переменную reducLine
                    String[] reducData = reducLine.split(",");//reducLine разделяется на отдельные значения, используя запятую в как разделителя, и сохраняется в массив reducData
                    String reductionSurname = reducData[0].trim();//из массива reducData извлекается фамилия сотрудника, находящаяся в индексе 0, и сохраняется в переменную reductionSurname.

                    if (reductionSurname.equalsIgnoreCase(surname)) {//сравниваются фамилия сотрудника reductionSurname и surname с игнорированием регистра
                        found = true;
                        break;
                    }
                }
                redScanner.close();

                if (!found) {//переменная found = false, значит фамилия сотрудника из файла "Список сотрудников.txt" не была найдена в файле "Сокращение.txt"
                    tempWriter.write(line + System.lineSeparator());//информация о сотруднике записывается во временный файл tempWriter
                }

                tempWriter.close();
            }
            scanner.close();



            //замена исходного файла сотрудников на временный файл
            File tempFile = new File("temp.txt");//создается временный файл
            employees.delete();//удаляет исходный файл "Список сотрудников.txt"
            tempFile.renameTo(employees);//временный файл переименовывается в исходный файл "Список сотрудников.txt" и становится основным файлом для храния информации

            System.out.println("Сотрудники, указанные в файле 'Сокращение', были удалены из файла 'Список сотрудников'.");
            System.out.println("До удаления сотрудников:");
            scanner = new Scanner(employees);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();

            System.out.println("\nПосле удаления сотрудников:");
            scanner = new Scanner(new File("Список сотрудников.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

