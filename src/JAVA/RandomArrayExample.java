package JAVA;

//Сгенерируйте массив целых чисел, используя класс Random(). Используя методы классов-
//коллекций:
//А) создайте новый массив, переписав в него часть элементов из первого массива
//Б) определите уникальные числа
//Г) отсортируйте массив

import java.util.*;

public class RandomArrayExample {
    public static void main(String[] args) {
        Random random = new Random();
        //генерация массива целых чисел
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        //создание нового массива, переписывая в него часть элементов из первого массива
        int[] newArr = new int[5];
        System.arraycopy(arr, 2, newArr, 0, 5);
        //вывод элементов нового массива
        System.out.println("Новый массив:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
        //определение уникальных чисел
        Set<Integer> uniqueNums = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            uniqueNums.add(arr[i]);
        }
        //вывод уникальных чисел
        System.out.println("Уникальные номера:");
        for (Integer num : uniqueNums) {
            System.out.print(num + " ");
        }
        System.out.println();

        //сортировка массива
        Arrays.sort(arr);

        //вывод отсортированного массива
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
