import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

    JFrame frame = new JFrame();
        frame.setSize(450,780);

    Field panel = new Field();
    panel.setBackground(new Color(50,161,87));
    //have background be a football field



        frame.add(panel);

    frame.setVisible(true);


    }
}