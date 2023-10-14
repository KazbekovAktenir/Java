package METHODS;

//import java.lang.Comparable;
//
//public class Compare_to {
//
//    public static void main(String args[]) {
//        String str1 = "Я буду хорошим программистом!";
//        String str2 = "Я буду хорошим программистом!";
//        String str3 = "Я буду хорошим дворником!";
//
//        int result = str1.compareTo(str2); //str1 = str2
//        System.out.println(result);//вывод: 0
//
//        result = str2.compareTo(str3);// str2 вызывающий объект, а str3 передан в качестве параметра
//        System.out.println(result);//вывод: '+' число, так как str2 > str3
//
//        result = str3.compareTo(str1);// str3 < str2
//        System.out.println(result);//вывод '-' число
//    }
//}

//Метод compareTo возвращает в результате выполнения сравнения целое число:
//положительное, если вызывающий объект больше объекта, переданного в качестве параметра;
//отрицательное, если вызывающий объект меньше объекта, переданного в качестве параметра;
//нуль, если объекты равны.


//public class Compare_to {
//    public static void main(String[] args) {
//
//        String str_Sample = "a";
//        System.out.println("Compare To 'a' b is : " + str_Sample.compareTo("b"));//a<b
//        str_Sample = "b";
//        System.out.println("Compare To 'b' a is : " + str_Sample.compareTo("a"));
//        str_Sample = "b";
//        System.out.println("Compare To 'b' b is : " + str_Sample.compareTo("b"));
//    }
//}


public class Compare_to {
    public static void main(String[] args) {
        String s1 = "Guru1";
        String s2 = "Guru2";
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        //сравнение двух строк
        int S = s1.compareTo(s2);
        //результаты сравнения
        if (S < 0) { System.out.println("\"" + s1 + "\"" + " лексикографически выше, чем " + "\"" + s2 + "\"");
        } else if (S == 0) {
            System.out.println("\"" + s1 + "\"" + " лексикографически равно " + "\"" + s2 + "\"");
        } else if (S > 0) {
            System.out.println("\"" + s1 + "\"" + " лексикографически меньше, чем " + "\"" + s2 + "\"");
        }
    }
}

