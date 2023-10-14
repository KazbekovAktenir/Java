package JAVA;

//Создайте следующие коллекции. Выполните различные действия с ними.
//Коллекция для хранения объектов: ArrayList


import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //создаем пустой список String
        ArrayList<String> list = new ArrayList<>();

        //добавляем элементы в список
        list.add("один");
        list.add("два");
        list.add("три");

        //выводим размер списка
        System.out.println("Размер списка: " + list.size());

        //проверяем, содержит ли список заданный элемент
        System.out.println("Список содержит 'два': " + list.contains("два"));

        //получаем элемент по индексу
        String element = list.get(1);
        System.out.println("Элемент с индексом 1: " + element);

        //изменяем элемент по индексу
        list.set(1, "новый два");
        System.out.println("Список после изменения элемента: " + list);

        //удаляем элемент по индексу
        list.remove(0);
        System.out.println("Список после удаления элемента: " + list);

        //удаляем заданный элемент
        boolean removed = list.remove("три");
        System.out.println("Список после удаления элемента 'три': " + list);

        //очищаем список
        list.clear();
        System.out.println("Список после очистки: " + list);

        //проверяем, является ли список пустым
        System.out.println("Список пустой: " + list.isEmpty());
    }
}
