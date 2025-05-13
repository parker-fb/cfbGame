import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//try to fix score bug alignment

public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setSize(450,780);
        frame.setLayout(new CardLayout());


        //3 difficulties - freshman: 10 balls varsity: 20 balls heisman: 25 balls


        JLabel panel = new JLabel();
        panel.setLayout(new GridLayout(4, 1));
        JLabel title = new JLabel("Choose Difficulty", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));




        JButton freshman = new JButton("Freshman");
        JButton varsity = new JButton("Varsity");
        JButton heisman = new JButton("Heisman");

        JButton help = new JButton("Help?");




        panel.add(title);
        panel.add(freshman);
        panel.add(varsity);
        panel.add(heisman);
        panel.add(help);




        frame.add(panel);




        freshman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //I searched this part up to make the program go from the menu with the three buttons to my actual game
                frame.getContentPane().removeAll();
                Field gamePanel = new Field(10);
                gamePanel.setBackground(new Color(50,161,87));
                frame.add(gamePanel);
                gamePanel.requestFocusInWindow();
            }
        });




        varsity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //i searched this part up to make the program go from the menu with the three buttons to my actual game
                frame.getContentPane().removeAll();
                Field gamePanel = new Field(20);
                gamePanel.setBackground(new Color(50,161,87));
                frame.add(gamePanel);
                gamePanel.requestFocusInWindow();
            }
        });




        heisman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //i searched this part up to make the program go from the menu with the three buttons to my actual game
                frame.getContentPane().removeAll();
                Field gamePanel = new Field(25);
                gamePanel.setBackground(new Color(50,161,87));
                frame.add(gamePanel);
                gamePanel.requestFocusInWindow();
            }
        });


        help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                JPanel newPanel = new JPanel();
                JLabel directions = new JLabel("WASD or Arrow keys to move/nHold shift+direction to spring/nDon't get hit/n score touchdowns");
                newPanel.add(directions);
                frame.add(newPanel);
                newPanel.requestFocusInWindow();
            }
        });




//        System.out.println("------------------------------------------------------------------------------------------");
//        System.out.println("                                       * Welcome to game *                                ");
//        System.out.println("                         * To start, click the screen to choose your team *               ");
//        System.out.println("                  * Use WASD or arrow keys to move player through defense *               ");
//        System.out.println("                                 * Hold Shift to sprint *                                 ");
//        System.out.println("          * Score as many touchdowns as you can before the timer runs out! *              ");
//        System.out.println("                                       * Have fun! *                                      ");
//        System.out.println("------------------------------------------------------------------------------------------");








        frame.setVisible(true);




    }
}
