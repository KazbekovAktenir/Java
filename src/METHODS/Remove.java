package METHODS;

//public class Remove {
//    public static void main(String[] args) {
//        String s = "Убираем\n"
//                + "все\n"
//                + "переносы\n"
//                + "строк\n";
//        System.out.println(
//                "Неизвестная строка с переносами: " + s);
//
//        //убираем переносы
//        s = s.replace("\n", " ");//replace() возвращает новый объект String,который содержит ту же последовательность символов, что и исходная строка, но с замененным символом.
//        System.out.println(
//                "Строка после того, как убрали переносы: " + s);
//    }
//}

//public class Remove {
//    public static void main(String[] args) {
//        String oldString = "ABC";
//        String newString = oldString.replace('A', 'L');
//
//        System.out.println("Old String: " + oldString);
//        System.out.println("New String: " + newString);
//    }
//}
//Вывод: LBC

//public class Remove {
//    public static void main(String[] args) {
//        String oldString = "Java";
//        String newString = oldString.replace('a', 'i'); //replace() заменяет все символы в строке на новый, а не только его первое вхождение
//
//        System.out.println("Old String: " + oldString);
//        System.out.println("New String: " + newString);
//    }
//}
//Вывод: Jivi


import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        String oldString = "Java";
        String newString = oldString.replace("av","oshu");//в строке Java ищем подстроку "av" и заменяем на "oshu"

        System.out.println("Old String: " + oldString);
        System.out.println("New String: " + newString);
    }
}
//Вывод: Joshua




