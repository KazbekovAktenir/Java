package JAVA;
//1С клавиатуры вводятся 4 числа. Используя условные конструкции, найти максимальное и
//минимальное отрицательное числа.


//import java.util.Scanner;
//
//public class Task4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int maxNegative = Integer.MIN_VALUE; // Инициализируем переменную максимального отрицательного числа
//        int minNegative = 0; // Инициализируем переменную минимального отрицательного числа
//
//        System.out.println("Введите 4 числа:");
//
//        for (int i = 0; i < 4; i++) {
//            int number = scanner.nextInt();
//
//            if (number < 0) {
//                if (number > maxNegative) {
//                    maxNegative = number;
//                }
//
//                if (minNegative == 0 || number < minNegative) {
//                    minNegative = number;
//                }
//            }
//        }
//
//        if (maxNegative == Integer.MIN_VALUE) {
//            System.out.println("Отрицательные числа не были введены.");
//        } else {
//            System.out.println("Максимальное отрицательное число: " + maxNegative);
//            System.out.println("Минимальное отрицательное число: " + minNegative);
//        }
//    }
//}


//2Написать программу, реализующую считывание с клавиатуры трех вещественных
//чисел. Вывести сумму этих чисел.

//import java.util.Scanner;
//
//public class Task4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System. in);
//        System.out.println("Введите три вещественных числа: ");
//
//        double num1 = scanner.nextDouble();
//        double num2 = scanner.nextDouble();
//        double num3 = scanner.nextDouble();
//
//        double sum = num1 + num2 + num3;
//        System.out.println("Сумма чисел: " + sum);
//    }
//}


//3Написать программу, которая вычисляет периметр прямоугольного треугольника
//по двум катетам side1, side2.

//import java.util.Scanner;
//import java.lang.Math;
//
//public class Task4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите длину первого катета: ");
//        double side1 = scanner.nextDouble();
//
//        System.out.print("Введите длину второго катета: ");
//        double side2 = scanner.nextDouble();
//
//        double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
//        System.out.println("Длина гипотенузы: " + hypotenuse);
//
//        double P = side1 + side2 + hypotenuse;
//        System.out.println("Периметр прямоугольного треугольника: " + P);
//    }
//}


//4 Написать программу для определения наименьшего числа из 5 введенных с
//клавиатуры вещественных чисел.

//import java.util.Scanner;
//
//public class Task4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите 5 вещественных чисел: ");
//
//        double smallest = Double.MAX_VALUE;// Инициализируем переменную наименьшего числа максимальным значением
//
//        for (int i=0; i<5; i++) {
//            double number = scanner.nextDouble();
//
//            if(number<smallest){
//                smallest = number;
//            }
//        }
//        System.out.println("Наименьшее число: " + smallest);
//    }
//}


// 5 Написать программу для определения наименьшей цифры из введенного трехзначного числа.

//import java.util.Scanner;
//
//public class Task4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите трехзначное число: ");
//
//        int number = scanner.nextInt();
//
//        int smallest = Integer.MAX_VALUE;// Инициализируем переменную наименьшей цифры максимальным значением
//
//        // Получаем каждую цифру числа и сравниваем с наименьшей
//
//        int digit1 = number / 100;
//        int digit2 = (number / 10) % 10;
//        int digit3 = number % 10;
//
//        if (digit1 < smallest) {
//            smallest = digit1;
//        }
//        if (digit2 < smallest) {
//            smallest = digit2;
//        }
//        if (digit3 < smallest) {
//            smallest = digit3;
//        }
//        System.out.println("Наименьшая цифра: " + smallest);
//    }
//}


// 6 Написать программу, реализующую считывание с клавиатуры трех вещественных чисел.
// Вывести среднее арифметическое этих чисел.

//import java.util.Scanner;
//
//public class Task4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите 3 вещественных числа: ");
//
//        double number1 = scanner.nextDouble();
//        double number2 = scanner.nextDouble();
//        double number3 = scanner.nextDouble();
//
//        double average = (number1 + number2 + number3) / 3;
//        System.out.println("Среднее арифметическое: " + average);
//    }
//}

// 7 Написать программу, которая вычисляет площадь прямоугольника.
//import java.util.Scanner;
//
//public class Task4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите длину прямоуголника: ");
//        double length = scanner.nextDouble();
//
//        System.out.println("Введите ширину прямоугольника: ");
//        double width = scanner.nextDouble();
//
//        double S = length * width;
//        System.out.println("Площадь прямоуголька: " + S);
//    }
//}


// 8 Написать программу, реализующую считывание с клавиатуры ответов на заранее
//прописанные вопросы. (Анкета или опросник)

//import java.util.Scanner;

//public class Task4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Анкета");
//
//        System.out.println("Вопрос 1: Как вас зовут? ");
//        String name = scanner.nextLine();
//
//        System.out.println("Вопрос 2: Сколько вам лет? ");
//        int age = scanner.nextInt();
//
//        scanner.nextLine();
//
//        System.out.println("Вопрос 3: Какой твой любимый цвет? ");
//        String color = scanner.nextLine();
//
//        System.out.println("Ваше имя: " + name);
//        System.out.println("Ваш возраст: " + age);
//        System.out.println("Ваш любимый цвет: " + color);
//    }
//}
