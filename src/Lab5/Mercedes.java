package Lab5;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mercedes extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);

        // Размеры и положение окружностей
        int circleRadius = 100;
        int circleX = 100;
        int circleY = 100;

        // Отрисовка окружностей
        g.drawOval(circleX, circleY, circleRadius, circleRadius);

        // Отрисовка линий
        int lineX1 = circleX + circleRadius / 2;
        int lineY1 = circleY;
        int lineX2 = circleX + circleRadius / 2;
        int lineY2 = circleY + circleRadius;
        g.drawLine(lineX1, lineY1, lineX2, lineY2);

        lineX1 = circleX;
        lineY1 = circleY + circleRadius / 2;
        lineX2 = circleX + circleRadius;
        lineY2 = circleY + circleRadius / 2;
        g.drawLine(lineX1, lineY1, lineX2, lineY2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mercedes Logo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.add(new Mercedes());
        frame.setVisible(true);
    }
}






