import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {



        JFrame frame = new JFrame();
        frame.setSize(450,780);



        //3 difficulties - freshman: 10 balls varsity: 15 balls heisman: 20 balls
//        JButton f = new JButton("Freshman");
//        f.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int d = 10;
//            }
//        });
//        JButton v = new JButton("Varsity");
//        v.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int d = 15;
//            }
//        });

        Field panel = new Field(20);
        panel.setBackground(new Color(50,161,87));


        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("                                       * Welcome to game *                                ");
        System.out.println("                         * To start, click the screen to choose your team *               ");
        System.out.println("                  * Use WASD or arrow keys to move player through defense *               ");
        System.out.println("                                 * Hold Shift to sprint *                                 ");
        System.out.println("          * Score as many touchdowns as you can before the timer runs out! *              ");
        System.out.println("                                       * Have fun! *                                      ");
        System.out.println("------------------------------------------------------------------------------------------");

//how can i make there be 3 difficulties, freshman:10 balls, varsity:15 balls, and heisman:20 balls where you choose them with buttons before the game starts


        frame.add(panel);
//        panel.add(f);
//        panel.add(v);


        frame.setVisible(true);




    }
}
