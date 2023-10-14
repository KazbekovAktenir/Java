

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try(PrintStream printStream = new PrintStream("Список сотрудников.txt"))
        {
            printStream.println("Фамилия И.О.,Дата рождения,Образование,Должность,Стаж,Оклад\n");
            printStream.println("Иванов Иван Иванович,01.01.1980,Высшее,Менеджер,15,50000\n");
            printStream.println("Петров Петр Петрович,05.05.1985,Среднее,Бухгалтер,8,40000\n");
            printStream.println("Петров Петр Петрович,05.05.1985,Среднее,Бухгалтер,8,40000\n");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}