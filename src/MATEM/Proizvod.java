package MATEM;

public class Proizvod{
    public static void main(String[] args){
        double x = 1.0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("----------" + i + "----------");
            System.out.println("f' = " + fc(x,i));
            System.out.println("f'' = " + ff(x,i));
        }
    }
    public static double f1(double x){
        double f = (Math.pow(x, 2) - 2) * Math.sqrt(4 + Math.pow(x, 2));
        return f;
    }
    public static double f2(double x){
        x = -3.00;
        double f = Math.log( Math.cos( (2*x + 3) / (x + 1)));
        return f;
    }
    public static double f3(double x){
        double f = Math.pow(Math.sin(x), 5*x/2);
        return f;
    }
    public static double f4(double x){
        double f = (Math.atan((x - 1) / Math.sqrt(2))) / Math.sqrt(2) + (x -1) / (Math.pow(x,2) - 2 * x +3);
        return f;
    }
    public static double fl(double x, int i) {
        double h = 0.001;
        double s = 0;
        switch (i) {
            case 1: s = ( f1(x) - f1(x-h) ) / h; break;
            case 2: s = ( f2(x) - f2(x-h) ) / h; break;
            case 3: s = ( f3(x) - f3(x-h) ) / h; break;
            case 4: s = ( f4(x) - f4(x-h) ) / h; break;
        }
        return s;
    }
    public static double fr(double x, int i) {
        double h = 0.001;
        double s = 0;
        switch (i) {
            case 1: s = ( f1(x + h) - f1(x) ) / h; break;
            case 2: s = ( f2(x + h) - f2(x) ) / h; break;
            case 3: s = ( f3(x + h) - f3(x) ) / h; break;
            case 4: s = ( f4(x + h) - f4(x) ) / h; break;
        }
        return s;
    }
    public static double fc(double x, int i) {
        double h = 0.0001;
        double s = 0;
        switch (i) {
            case 1: s = ( f1(x + h) - f1(x - h) ) / (2*h); break;
            case 2: s = ( f2(x + h) - f2(x - h) ) / (2*h); break;
            case 3: s = ( f3(x + h) - f3(x - h) ) / (2*h); break;
            case 4: s = ( f4(x + h) - f4(x - h) ) / (2*h); break;
        }
        return s;
    }
    public static double ff(double x, int i) {
        double h = 0.001;
        double s = 0;
        switch (i) {
            case 1:
                s = (f1(x + h) - 2 * f1(x) + f1(x - h)) / Math.pow(h, 2); break;
            case 2:
                s = (f2(x + h) - 2 * f2(x) + f2(x - h)) / Math.pow(h, 2); break;
            case 3:
                s = (f3(x + h) - 2 * f3(x) + f3(x - h)) / Math.pow(h, 2); break;
            case 4:
                s = (f4(x + h) - 2 * f4(x) + f4(x - h)) / Math.pow(h, 2); break;
        }
        return s;
    }
}

