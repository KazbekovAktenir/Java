package Lab5;

import java.awt.*;
import javax.swing.*;

public class Car extends JPanel {
    public void paint(Graphics g) {
        super.paint(g); // Очистить панель

        g.setColor(Color.LIGHT_GRAY);
        g.setFont(new Font("Montserrat", Font.BOLD, 11));
        int len = 30;
        for (int x = len; x < getWidth() - len; x += len) {
            g.drawLine(x, len, x, getHeight() - len);
            g.drawString(String.valueOf(x), x - 10, 20);
        }
        for (int y = len; y < getHeight() - len; y += len) {
            g.drawLine(len, y, getWidth() - len, y);
            g.drawString(String.valueOf(y), 2, y + 2);
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Рисование дороги
        g.setColor(Color.GRAY);
        g.fillRect(0, getHeight() / 2 - 40, getWidth(), 80);

        g.setColor(Color.YELLOW);
        int dashWidth = 10;
        int dashGap = 5;
        int numDashes = getWidth() / (dashWidth + dashGap);
        for (int i = 0; i < numDashes; i++) {
            int x = i * (dashWidth + dashGap);
            g.fillRect(x, getHeight() / 2, dashWidth, 3);
        }

        // Рисование автомобиля
        g.setColor(Color.RED);
        g.fillRect(110, 130, 140, 80);

        g.setColor(Color.BLACK);
        g.drawRect(110, 130, 140, 80);

        g.setColor(Color.BLUE);
        g.fillRect(125, 145, 50, 40);
        g.fillRect(185, 145, 50, 40);

        g.setColor(Color.YELLOW);
        g.fillOval(130, 195, 40, 40);
        g.fillOval(190,  195, 40, 40);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Car Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Car());
        frame.setSize(550, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
