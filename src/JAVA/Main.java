package JAVA;

//Проведите частотный анализ слов и символов из первой строки. Определите символы,
//которые входят в первую и не входят во вторую

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;



public class Main {
    public static void main(String[] args) {
        String str1 = "Я недавно начал изучать Джава";
        String str2 = "В связи с этим навык гуглинга очень важен";

        //разделение строки на слова
        String[] words1 = str1.split("\\s+");
        String[] words2 = str2.split("\\s+");

        //подсчет частоты символов и слов
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);//помещает символ c в freq1 с соответствующим значением: либо увеличивает значение, если символ уже есть в freq1, либо добавляет новую запись со значением 1, если символа еще нет в freq1
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
        }

        //вывод частоты символов и слов первой строки
        System.out.println("Частота символов и слов в первой строке:");
        for (Map.Entry<Character, Integer> entry : freq1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());//entry.getKey() возвращает символ записи
            //entry.getValue() возвращает количество символа в первой строк
        }
        for (String word : words1) {
            System.out.println(word + ": " + Collections.frequency(Arrays.asList(words1), word));
        }

        //вывод символов, которые входят в первую и не входят во вторую строку
        System.out.println("Символы, которые есть в первой, но не во второй строке:");
        for (Map.Entry<Character, Integer> entry : freq1.entrySet()) {
            char c = entry.getKey();
            if (freq2.containsKey(c)) {//проверяет, содержит ли freq2 символ c
                continue;
            }
            System.out.println(c);
        }
    }
}
