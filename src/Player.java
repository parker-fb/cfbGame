import javax.swing.*;
import java.awt.*;

public class Player {

    private int x,y,size, xSpeed;
    private Color color;
    private ImageIcon pic = new ImageIcon("fb.png");
    private boolean td;



    public Player(){

        x = (int)(Math.random()*400)+20;
        y = (int)(Math.random()*680)+10;
        size = 30;
        color = Color.BLUE;
        xSpeed = (int)(Math.random()*6);
    }

    public Player(int x, int y){
        this.x = x;
        this.y = y;
        size = 30;
        color = Color.BLACK;
        xSpeed = 5;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isTd() {
        return td;
    }

    public void setTd(boolean td) {
        this.td = td;
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }

    public void playerDraw(Graphics g){
        g.setColor(color);
        g.drawImage(pic.getImage(), x, y, size, size,null);
    }

    public void checkDefeat(Player p){
        int bx = p.x - this.x;
        int by = p.y - this.y;
        int dist2 = bx * bx + by * by;
        int radius = (this.size/2) + (p.size/2);
        if (dist2 <= radius * radius){
            System.out.println("You lose, Sorry!");
        }
    }

    public void move(){
        x+=xSpeed;
    }

    public void bounds(Field f){
        if (x > f.getSize().getWidth() - size){
            xSpeed *= -1;
        }
        if (x < 0){
            xSpeed *= -1;
        }


    }

    public void playerBounds(Field f){
        if (x > f.getSize().getWidth() - size){
            System.out.println("You lose! Out of Bounds");
        }
        if (x < 0){
            System.out.println("You lose! Out of Bounds");
        }
        if (y < 95){
            if (!isTd()) {
                System.out.println("score");
                setTd(true);

                // End the game
                if (f instanceof Field) {
                    ((Field) f).setGameOver(true);
                }
            }

        }
    }


}
