package Lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

public class Opel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Нарисовать фон белого цвета
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        Color customColor = new Color(6, 42, 138); // Темно-синий цвет

        // Нарисовать овал синего цвета в верхней части
        g2d.setColor(customColor);
        g2d.fillArc(50, 50, 300, 300, 0, 180);
        g2d.setColor(Color.black);
        g2d.drawArc(50, 50, 300, 300, 0, 180);

        // Нарисовать белую полосу
        g2d.setColor(customColor);
        g2d.fillRect(180, 190, 40, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Opel Logo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 450);
        frame.setLocationRelativeTo(null);
        frame.add(new Opel());
        frame.setVisible(true);
    }
}
