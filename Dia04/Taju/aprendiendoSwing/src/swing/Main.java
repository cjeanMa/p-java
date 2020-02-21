package swing;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Numbers numb = new Numbers();
    }
}

class Numbers {
    JFrame container;
    ArrayList<JPanel> panels;

    public Numbers() {
        arrayList();
    }

    public void arrayList() {
        container = new JFrame();
        container.setSize(300, 500);
        container.setLayout(new GridLayout(0, 6));
        container.setVisible(true);
        container.setLocation(500, 300);
        container.setTitle("Cuadraditos UwU");
        container.setPreferredSize(new Dimension(300, 500));
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panels = new ArrayList();
        for (int i = 0; i < 60; i ++) {
            JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JLabel number = new JLabel("" + (i + 1));
            panel.setBorder(BorderFactory.createEtchedBorder());
            panel.add(number);
            panels.add(panel);
        }

        panels.forEach(cons -> {
            container.add(cons);
        });
    }
}