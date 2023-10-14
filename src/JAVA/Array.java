package JAVA;

// 1 Дано целое число N (> 0). Сформировать и вывести целочисленный массив
//размера N, содержащий N первых положительных нечетных чисел:1, 3, 5, ...

//import java.util.Scanner;
//import java.util.Arrays;
//
//public class Array {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите размер массива: ");
//        int N = scanner.nextInt();
//
//        int[] array = new int[N];
//        int number = 1;
//
//        for(int i = 0; i < N; i++){
//            array[i] = number;
//            number += 2;
//        }
//        System.out.println("Массив нечетных чисел: " + Arrays.toString(array));
//    }
//}


// 2 Дан массив A размера N и целое число K (1 ≤ K ≤ N). Вывести элементы
//массива с порядковыми номерами, кратными K: AK, A2·K, A3·K, .... Условный оператор не использовать.
//import java.util.Arrays;
//
//public class Array {
//    public static void main(String[] args) {
//        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int K = 2;
//
//        for(int i = K; i <= A.length; i += K) {
//            System.out.println(A[i - 1]);
//        }
//    }
//}

// 3 Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N). Найти среднее
//арифметическое элементов массива с номерами от K до L включительно.
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println("Введите значение K: ");
        int K = scanner.nextInt();

        System.out.println("Введите значение L: ");
        int L = scanner.nextInt();

        while (L <= K){
            System.out.println("Ошибка: L должен быть больше К");
            System.out.println("Введите знгачение L: ");
            L = scanner.nextInt();
        }

        int sum = 0;
        int count = L - K + 1;

        for (int i = K - 1; i <= L - 1; i++) {
            sum += A[i];
        }

        double average = (double) sum / count;
        System.out.println("Среднее арифметическое: " + average);
    }
}

// 4 Дано целое число N (> 0). Сформировать и вывести целочисленный массив
//размера N, содержащий степени двойки от первой до N-й:2, 4, 8, 16, ....

//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Array {
//    public static void main(String[] args) {
//
//    }
//}