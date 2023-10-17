
//Класс LinkedList представляет собой двусвязный список,
// который является одной из структур данных для хранения и управления коллекцией элементов.
// LinkedList предоставляет реализацию интерфейсов List и Deque, что означает,
// что он может использоваться как список элементов и как двусторонняя очередь (двунаправленный список).

import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        //добавление элементов в список
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        //добавление элемента в начало списка
        linkedList.addFirst("New First");

        //удаление элемента из конца списка
        linkedList.removeLast();

        //обход элементов списка
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
