package Lab5;

//import javax.swing.*;
//import java.awt.*;
//
//public class Circle extends JFrame {
//
//    public Circle() {
//        setTitle("Drawing Example");
//        setSize(400, 400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        Graphics2D g2d = (Graphics2D) g;
//
//
//        // Рисуем круг
//        g2d.drawOval(100, 100, 100, 100);
//
//    }
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new Circle());
//    }
//}


//import javax.swing.*;
//import java.awt.*;
//
//public class Circle extends JFrame {
//
//    public Circle() {
//        setTitle("Drawing Example");
//        setSize(400, 400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        Graphics2D g2d = (Graphics2D) g;
//
//        int centerX = 150; // Координата X центра круга
//        int centerY = 150; // Координата Y центра круга
//        int radius = 100; // Радиус круга
//
//        // Рисуем круг
//        g2d.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
//
//        // Рисуем радиус, соединяющий центр круга с верхней точкой
//        g2d.drawLine(centerX, centerY - radius, centerX, centerY);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new Circle());
//    }
//}


