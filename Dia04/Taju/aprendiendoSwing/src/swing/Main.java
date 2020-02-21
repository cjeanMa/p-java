package swing;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // miMarco marco1 = new miMarco();
        Numbers numb = new Numbers();
        // marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Numbers extends JFrame {
    JPanel container;
    ArrayList<JPanel> panels;

    public Numbers() {
        arrayList();
    }

    public void arrayList() {

        container = new JPanel();
        container.setVisible(true);
        container.setLayout(new GridLayout(0, 6));
        container.setPreferredSize(new Dimension(300, 500));



        panels = new ArrayList();
        for (int i = 0; i < 60; i ++) {
            System.out.println(i);
            JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JLabel number = new JLabel("" + (i + 1));
            panel.setBorder(BorderFactory.createEtchedBorder());
            panel.add(number);
            panels.add(panel);
        }

        panels.forEach(cons -> {
            System.out.println(cons);
            container.add(cons);
        });
    }
}

