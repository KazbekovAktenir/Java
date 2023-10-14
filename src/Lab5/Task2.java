package Lab5;

//import java.awt.Color;
//import java.awt.Graphics;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class Task2 extends JPanel {
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        g.setColor(Color.black);
//        int  y1=10,y2=200, x1=100, x2=100;
//        while(x2<200){
//            g.drawLine(x2, y1, x1, y2);
//            x2+=10;
//            x1+=10;
//
//        }
//    }
//
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Line B2-2");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300, 250);
//        frame.setLocationRelativeTo(null);
//        frame.add(new Task2());
//        frame.setVisible(true);
//    }
//}


//import javax.swing.*;
//import java.awt.*;
//
//public class Task2 extends JPanel {
//    private int x1, y1; // Координаты точки 1
//    private int x2, y2; // Координаты точки 2
//
//    public Task2() {
//        x1 = 100;
//        y1 = 100;
//        x2 = 200;
//        y2 = 200;
//
//        // Создаем таймер, который будет обновлять координаты точек и перерисовывать изображение
//        Timer timer = new Timer(10, e -> {
//            x1 -= 1; // Перемещение точки 1 вверх
//            y2 += 1; // Перемещение точки 2 вниз
//            repaint(); // Перерисовываем изображение
//        });
//        timer.start();
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.setColor(Color.BLACK);
//        g.drawLine(x1, y1, x2, y2); // Рисуем линию между точками 1 и 2
//    }
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Dynamic Image");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 400);
//        Task2 dynamicImage = new Task2();
//        frame.add(dynamicImage);
//        frame.setVisible(true);
//    }
//}

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task2 extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);

        int x1 = 100, y1 = 100; // Начальная точка
        int length = 100; // Длина линии
        double angle = Math.toRadians(45); // Угол в радианах (45 градусов)

        for (int i = 0; i < 20; i++) {
            // Вычисляем координаты конечной точки
            int x2 = x1 + (int) (length * Math.cos(angle));
            int y2 = y1 - (int) (length * Math.sin(angle));

            g.drawLine(x1, y1, x2, y2);

            // Перемещаем начальную точку для следующей линии
            x1 += 20;
            y1 += 20;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Line B2-2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.add(new Task2());
        frame.setVisible(true);
    }
}





