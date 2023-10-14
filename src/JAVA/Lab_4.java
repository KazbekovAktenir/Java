package JAVA;


//import java.util.ArrayList;
//import java.util.HashSet;
//
//public class Lab_4 {
//    public static void main(String[] args) {
//        // Создание коллекции ArrayList
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        // Добавление элементов в ArrayList
//        arrayList.add("apple");
//        arrayList.add("banana");
//        arrayList.add("cherry");
//
//        // Вывод содержимого ArrayList
//        System.out.println("ArrayList: " + arrayList);
//
//        // Удаление элемента из ArrayList
//        arrayList.remove("banana");
//
//        // Вывод содержимого ArrayList после удаления элемента
//        System.out.println("ArrayList после удаления: " + arrayList);
//
//        // Создание коллекции HashSet
//        HashSet<Integer> hashSet = new HashSet<>();
//
//        // Добавление элементов в HashSet
//        hashSet.add(10);
//        hashSet.add(20);
//        hashSet.add(30);
//        hashSet.add(40);
//        hashSet.add(50);
//
//        // Вывод содержимого HashSet
//        System.out.println("HashSet: " + hashSet);
//
//        // Поиск элемента в HashSet
//        boolean Found = hashSet.contains(30);
//
//        // Вывод результата поиска
//        System.out.println("Элемент 30 найден в HashSet: " + Found);
//    }
//}



//2) Создайте очередь Deque, заполните элементами, повлияйте на первый и последний элементы
//import java.util.ArrayDeque;
//
//public class Lab_4    {
//
//    public static void main(String[] args) {
//
//        ArrayDeque<String> states = new ArrayDeque<String>();
//        // стандартное добавление элементов
//        states.add("Германия");
//        states.addFirst("Франция"); // добавляем элемент в самое начало
//        states.push("Великобритания"); // добавляем элемент в самое начало
//        states.addLast("Испания"); // добавляем элемент в конец коллекции
//        states.add("Италия");
//
//        // получаем первый элемент без удаления
//        String sFirst = states.getFirst();
//        System.out.println(sFirst);     // Great Britain
//        // получаем последний элемент без удаления
//        String sLast = states.getLast();
//        System.out.println(sLast);      // Italy
//
//        System.out.printf("Queue size: %d \n", states.size());  // 5
//
//        // перебор коллекции
//        while(states.peek()!=null){
//            // извлечение c начала
//            System.out.println(states.pop());
//        }
//
//        // очередь из объектов Person
//        ArrayDeque<Person> people = new ArrayDeque<Person>();
//        people.addFirst(new Person("Улук"));
//        people.addLast(new Person("Атай"));
//        // перебор без извлечения
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


//3) Сгенерируйте массив целых чисел, используя класс Random(). Используя методы классов-коллекций:
//        А) создайте новый массив, переписав в него часть элементов из первого массива
//        Б) определите уникальные числа
//        Г) отсортируйте массив

//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Random;
//import java.util.stream.Collectors;
//
//public class Lab_4 {
//    public static void main(String[] args) {
//        int[] arr = new int[10];
//        Random random = new Random();
//
//        // заполняем массив случайными числами от 0 до 9
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(10);
//        }
//
//        // создаем новый массив, переписывая в него только четные элементы из первого массива
//        int[] evenArr = Arrays.stream(arr)
//                .filter(num -> num % 2 == 0)
//                .toArray();
//
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//        System.out.println("Новый массив, содержащий только четные элементы: " + Arrays.toString(evenArr));
//
//        // определяем уникальные числа в массиве
//        HashSet<Integer> uniqueNums = Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.toCollection(HashSet::new));
//
//        System.out.println("Уникальные числа в массиве: " + uniqueNums);
//
//        // сортируем массив
//        Arrays.sort(arr);
//        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
//    }
//}


// 4) Проведите частотный анализ слов и символов из первой строки.
// Определите символы которые, входят в первую и не входят во вторую.

//import java.util.HashSet;
//import java.util.HashMap;
//
//public class Lab_4 {
//    public static void main(String[] args) {
//        String f_String = "Это первая строка";
//        String s_String = "Это вторая строка";
//
//        // проводим частотный анализ символов первой строки
//        HashMap<Character, Integer> charFrequency = new HashMap<>();
//        for (char c : f_String.toCharArray()) {
//            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
//        }
//
//        // определяем символы, которые входят в первую строку и не входят во вторую
//        HashSet<Character> uniqueChars = new HashSet<>();
//        for (char c : f_String.toCharArray()) {
//            if (charFrequency.get(c) != null && (s_String.indexOf(c) == -1 || charFrequency.get(c) > 1)) {
//                uniqueChars.add(c);
//            }
//        }
//
//        System.out.println("Первая строка: " + f_String);
//        System.out.println("Вторая строка: " + s_String);
//        System.out.println("Символы, которые входят в первую строку и не входят во вторую: " + uniqueChars);
//    }
//}
