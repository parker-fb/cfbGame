import java.awt.*;

public class Player {

    private int x,y,size;
    private Color color;


    public Player(){

        x = (int)(Math.random()+20);
        y = (int)(Math.random()+20);
        size = 30;
        color = Color.BLUE;


    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }


}
