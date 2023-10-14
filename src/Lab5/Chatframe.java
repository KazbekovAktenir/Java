package Lab5;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.geom.*;
//import java.io.File;
//import java.io.IOException;
//
//public class Chatframe {
//    public static void main(String[] args) {
//        JFrame jFrame = getFrame();
//        jFrame.add(new MyComponent());
//    }
//    static class MyComponent extends JComponent {
//        public void paint(Graphics g) {
//            Graphics2D g2 = (Graphics2D) g;
//
//
//        }
//    }
//
//    static JFrame getFrame() {
//        JFrame jFrame = new JFrame();
//        jFrame.setVisible(true);
//        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Dimension dimension = toolkit.getScreenSize();
//        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 550, 500);
//        return jFrame;
//    }
//}


import javax.swing.*;
import java.awt.*;
class gui {
    public static void main(String args[]) {

        //Создание рамки
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Создание MenuBar и добавление компонентов
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        //Создание панели внизу и добавление компонентов
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        //Текстовая область в центре
        JTextArea ta = new JTextArea();

        //Добавление компонентов в кадр
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
