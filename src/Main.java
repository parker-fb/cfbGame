import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

    JFrame frame = new JFrame();
        frame.setSize(450,780);

    Field panel = new Field();
    panel.setBackground(new Color(50,161,87));


        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("                  * Welcome to game *");
        System.out.println("  * To start, click the screen to choose your team *");
        System.out.println(" * Use WASD or arrow keys to move player through defense *");
        System.out.println("* Score as many touchdowns as you can before timer runs out! *");
        System.out.println("                    * Have fun! *");
        System.out.println("------------------------------------------------------------------------------------------");


        frame.add(panel);

    frame.setVisible(true);


    }
}