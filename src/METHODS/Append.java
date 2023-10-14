package METHODS;

public class Append {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("open");
        StringBuffer str2 = str1;
        str1.append("genus");
        System.out.println(str1 + " " + str2 + " " + (str1 == str2));
    }
}
