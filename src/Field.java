import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Field extends JPanel {



    private Player player0;
    private Player[] players;
    private JLabel endzone;
    int change = 0;




    public Field(){

        setFocusable(true);


        player0 = new Player(200,710);
        players = new Player[20];
        for (int i = 0; i < players.length; i++){
            players[i] = new Player();
        }




        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println(e);


                if(e.getKeyCode() == 68){
                    //right
                    player0.setX(player0.getX()+8);
                }

                else if(e.getKeyCode() == 65){
                    //left
                    player0.setX(player0.getX()-8);
                }


                else if (e.getKeyCode() == 83){
                    //up
                    player0.setY(player0.getY()+8);
                }

                else if (e.getKeyCode() == 87){
                    //down
                    player0.setY(player0.getY()-8);
                }


                else if (e.getKeyCode() == 16){
                    //boost
                    player0.setY(player0.getY()-16);
                }

            }
        });

        endzone = new JLabel("ENDZONE");
        endzone.setFont(new Font("Arial", Font.BOLD, 30));
        endzone.setForeground(Color.WHITE);
        endzone.setBounds(150, 100, 200, 50);
        this.add(endzone);



        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (change == 0){
                endzone = new JLabel("PENN STATE");
                change++;
                }
                else if (change == 1){
                    endzone = new JLabel("OHIO STATE");
                    change++;
                }
                else if (change == 2){
                    endzone = new JLabel("ALABAMA");
                    change++;
                }
            }
        });


    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        g.setColor(Color.BLACK);
//        g.fillOval(200,710,30,30);


        g.setColor(Color.WHITE);
        g.drawLine(0, 95, 450, 95);
        g.drawLine(0, 195, 450, 195);
        g.drawLine(0, 295, 450, 295);
        g.drawLine(0, 395, 450, 395);
        g.drawLine(0, 495, 450, 495);
        g.drawLine(0, 595, 450, 595);
        g.drawLine(0, 695, 450, 695);
        g.drawLine(0, 795, 450, 795);

        //hashes

        g.drawLine(45, 85, 45, 105);
        int x = 45;
        int y1 = 85;
        int y2 = 105;
        //g.drawLine(45, 185, 45, 205);
        for(int i = 0; i < 6; i++) {
            y1+=100;
            y2+=100;
            g.drawLine(x, y1, x, y2);
        }
        g.drawLine(405,85,405,105);
        int xx = 405;
        int yy1 = 85;
        int yy2 = 105;
        for (int i = 0; i < 6; i++){
            yy1+=100;
            yy2+=100;
            g.drawLine(xx, yy1, xx, yy2);
        }

        player0.draw(g);
        for (int i = 0; i < players.length; i++){
            players[i].draw(g);
            players[i].move();
            players[i].bounds(this);
            player0.checkDefeat(players[i]);
            player0.playerBounds(this);
        }

//        for(Player p: players){
//            p.draw(g);
//        }



        try {
            Thread.sleep(25);
        }
        catch(Exception e){

        }

        repaint();
    }




}
