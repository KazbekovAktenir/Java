package JAVA;

//Создайте очередь Deque, заполните элементами, повлияйте на первый и последний элементы


import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        //создание очереди Deque
        Deque<String> deque = new ArrayDeque<String>();

        //добавление элементов в очередь
        deque.add("Яблоко");
        deque.addFirst("Банан");
        deque.addLast("Вишня");
        deque.push("Груша");
        deque.offer("Мандарин");

        //вывод всех элементов очереди
        System.out.println("Элементы Deque:");
        for (String element : deque) {
            System.out.println(element);
        }

        //получение и удаление первого элемента очереди
        String firstElement = deque.pollFirst();
        System.out.println("Удаленный первый элемент: " + firstElement);

        //получение и удаление последнего элемента очереди
        String lastElement = deque.pollLast();
        System.out.println("Удаленный последний элемент: " + lastElement);

        //получение первого элемента очереди без удаления
        String peekFirst = deque.peekFirst();
        System.out.println("Первый элемент: " + peekFirst);

        //получение последнего элемента очереди без удаления
        String peekLast = deque.peekLast();
        System.out.println("Последний элемент: " + peekLast);

        //вывод размера очереди
        System.out.println("Размер очереди: " + deque.size());

        //очистка очереди
        deque.clear();
        System.out.println("Очишенная очередь");

        //проверка, является ли очередь пустой
        boolean isEmpty = deque.isEmpty();
        System.out.println("Очередь пустой? " + isEmpty);
    }
}

