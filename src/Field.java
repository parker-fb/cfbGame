import javax.swing.*;
import java.awt.*;

public class Field extends JPanel {



    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;



    public Field(){




    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(200,710,30,30);
        player1.draw(g);
        player2.draw(g);
        player3.draw(g);
        player4.draw(g);




        repaint();
    }




}
