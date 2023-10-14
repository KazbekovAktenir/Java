package JAVA;

//Создайте следующие коллекции. Выполните различные действия с ними.
//Коллекция для хранения и поиска уникальных идентификаторов: HashSet

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        //создание коллекции HashSet
        HashSet<String> hashSet = new HashSet<String>();

        //добавление элементов в коллекцию
        hashSet.add("Яблоко");
        hashSet.add("Банан");
        hashSet.add("Вишня");
        hashSet.add("Груша");
        hashSet.add("Мандарин");

        //вывод размера коллекции
        System.out.println("Размер HashSet: " + hashSet.size());

        //проверка, содержится ли элемент в коллекции
        boolean containsApple = hashSet.contains("Яблоко");
        System.out.println("HashSet содержит «Яблоко»: " + containsApple);

        //удаление элемента из коллекции
        boolean removedBanana = hashSet.remove("Банан");
        System.out.println("Удален «Банан» из HashSet: " + removedBanana);

        //вывод всех элементов коллекции с помощью итератора
        System.out.println("Элементы HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //очистка коллекции
        hashSet.clear();
        System.out.println("HashSet очищен ");

        //проверка, является ли коллекция пустой
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("HashSet пуст? " + isEmpty);
    }
}
