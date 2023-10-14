import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Directory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите путь к директории: ");
        String directoryPath = scanner.nextLine();
//1. Создайте директорию.
        //cоздание директории
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Директория успешно создана.");
        }
//2. Занесите с клавиатуры текст. Разбейте его на отдельные предложения, каждое из которых сохраните в
//отдельный файл в той же директории.
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        //разделение текста на предложения
        String[] sentences = text.split("\\. ");

        //создание файлов для каждого предложения
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            String fileName = "java" + (i + 1) + ".txt";
            String filePath = directoryPath + File.separator + fileName;

            try {
                Files.write(Paths.get(filePath), sentence.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//3. Выведите содержимое каталога в следующем виде: Название файла, абсолютный путь к файлу, размер и дату
//последней модификации файла.
        //вывод содержимого каталога
        System.out.println("Содержимое каталога:");
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println("Название файла: " + file.getName());
                System.out.println("Абсолютный путь к файлу: " + file.getAbsolutePath());

                try {
                    BasicFileAttributes attributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
                    System.out.println("Размер файла: " + attributes.size() + " байт");
                    System.out.println("Дата последней модификации файла: " + Files.getLastModifiedTime(file.toPath()));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println();
            }
        }

        System.out.print("Введите название файла для проверки: ");
        String fileNameToCheck = scanner.nextLine();
        String filePathToCheck = directoryPath + File.separator + fileNameToCheck;

        File fileToCheck = new File(filePathToCheck);
//Проверьте существует ли файл в каталоге, название которого совпадает с введенным с клавиатуры. Если да,
//то удалите. Если нет, то создайте его и запишите в файл информацию вида: Родительский каталог, путь к файлу.
        //проверка существования файла
        if (fileToCheck.exists()) {
            // Удаление файла
            if (fileToCheck.delete()) {
                System.out.println("Файл успешно удален.");
            }
            else {
                System.out.println("Не удалось удалить файл.");
            }
        } else {
            // Создание файла и запись информации
            try {
                FileWriter writer = new FileWriter(filePathToCheck);
                writer.write("Родительский каталог: " + directory.getParent());
                writer.write("Путь к файлу: " + filePathToCheck);
                writer.close();
                System.out.println("Файл создан и записан.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//Скопируйте файл из каталога на рабочий стол при помощи Files.Copy()
        //копирование файла на рабочий стол
        //выбор файла для копирования
        System.out.print("Введите название файла для копирования на рабочий стол: ");
        String fileNameToCopy = scanner.nextLine();
        String filePathToCopy = directoryPath + File.separator + fileNameToCopy;
        File fileToCopy = new File(filePathToCopy);

        //проверка существования файла и копирование на рабочий стол
        if (fileToCopy.exists()) {
            String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
            String destinationFilePath = desktopPath + File.separator + fileNameToCopy;

            try {
                Files.copy(fileToCopy.toPath(), Path.of(destinationFilePath), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Файл скопирован на рабочий стол.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Файл не существует.");
        }

        scanner.close();
    }
}


//C:\Users\User\Desktop\file




