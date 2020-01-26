package swing;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        ListButton buttons = new ListButton();

        buttons.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class ListButton extends JFrame {
    JButton[] arrayBtn = new JButton[200];
    public ListButton() {
        setLayout(new GridLayout(0, 10));
        setVisible(true);
        setSize(480, 320);
        setLocation(500, 300);
        setTitle("Hola Mundo");
        for ( int i = 0; i < arrayBtn.length; i++) {
            arrayBtn[i] = new JButton("" + (i + 1));
            add(arrayBtn[i]);
        }
    }
}