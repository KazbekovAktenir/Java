package JAVA;

//package JAVA;
//
//import java.util.ArrayList;
//
//public class Lab_4{
//    public static void main(String[] args) {
//
//        ArrayList<String> people = new ArrayList<String>();
//        // добавим в список ряд элементов
//        people.add("Uluk");
//        people.add("Asel");
//        people.add("Liliana");
//        people.add("Atai");
//        people.add(1, "Nurseit"); // добавляем элемент по индексу 1
//
//        System.out.println(people.get(1));// получаем 2-й объект
//        people.set(1, "Nursultan"); // установка нового значения для 2-го объекта
//
//        System.out.printf("ArrayList состоит из %d элементов. \n", people.size());
//        for(String person : people){
//
//            System.out.println(person);
//        }
//        // проверяем наличие элемента
//        if(people.contains("Uluk")){
//
//            System.out.println("ArrayList содержит Улук");
//        }
//
//        // удалим несколько объектов
//        // удаление конкретного элемента
//        people.remove("Nursultan");
//        // удаление по индексу
//        people.remove(0);
//
//        Object[] peopleArray = people.toArray();
//        for(Object person : peopleArray){
//
//            System.out.println(person);
//        }
//    }
//}




//import java.util.HashSet;
//
//public class Lab_4{
//
//    public static void main(String[] args) {
//
//        HashSet<String> states = new HashSet<String>();
//
//        // добавим в список ряд элементов
//        states.add("Germany");
//        states.add("France");
//        states.add("Italy");
//        // пытаемся добавить элемент, который уже есть в коллекции
//        boolean isAdded = states.add("Germany");
//        System.out.println(isAdded);    // false
//
//        System.out.printf("Set contains %d elements \n", states.size());    // 3
//
//        for(String state : states){
//
//            System.out.println(state);
//        }
//        // удаление элемента
//        states.remove("Germany");
//
//        // хеш-таблица объектов Person
//        HashSet<Person> people = new HashSet<Person>();
//        people.add(new Person("Mike"));
//        people.add(new Person("Tom"));
//        people.add(new Person("Nick"));
//        for(Person p : people){
//
//            System.out.println(p.getName());
//        }
//    }
//}
//class Person{
//
//    private String name;
//    public Person(String value){
//
//        name=value;
//    }
//    String getName(){return name;}
//}


//import java.util.ArrayList;
//
//public class Lab_4 {
//    public static void main(String[] args) {
//        // Создаем пустую коллекцию ArrayList
//        ArrayList<String> myList = new ArrayList<>();
//
//        // Добавляем элементы в коллекцию
//        myList.add("Первый элемент");
//        myList.add("Второй элемент");
//        myList.add("Третий элемент");
//
//        // Выводим содержимое коллекции на экран
//        System.out.println("Содержимое коллекции:");
//        for (String element : myList) {
//            System.out.println(element);
//        }
//
//        // Получаем элемент по индексу и выводим на экран
//        String firstElement = myList.get(0);
//        System.out.println("Первый элемент в коллекции: " + firstElement);
//
//        // Удаляем элемент по индексу
//        String removedElement = myList.remove(1);
//        System.out.println("Удаленный элемент: " + removedElement);
//
//        // Изменяем значение элемента
//        String secondElement = myList.get(1);
//        myList.set(1, "Измененный элемент");
//        System.out.println("Измененное значение второго элемента: " + myList.get(1));
//
//        // Проверяем, содержит ли коллекция элемент
//        boolean containsElement = myList.contains("Третий элемент");
//        System.out.println("Содержит ли коллекция элемент 'Третий элемент'? " + containsElement);
//
//        // Получаем количество элементов в коллекции
//        int size = myList.size();
//        System.out.println("Количество элементов в коллекции: " + size);
//
//        // Очищаем коллекцию
//        myList.clear();
//        System.out.println("Коллекция очищена. Количество элементов: " + myList.size());
//    }
//}
