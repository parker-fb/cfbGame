import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Field extends JPanel {



    private Player player0;
    private Player[] players;
    private JLabel endzone;
    private int change = 0;
    private boolean win = false;
    private boolean tackle = false;
    private boolean timeUp = false;
    private int defenders;
    private JLabel point;
    private String poi = "00";
    private JLabel timer;
    private int time = 10;
    private Timer timerr;



    public Field(int d){


        timerr = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (time < 1) {
                    timeUp = true;
                    gameOver = true;
                }
                if (time > 0) {
                    time--;
                    timer.setText(time + "");
                }
            }
        });
        timerr.start();

        JLabel scorebug = new JLabel("Your Score");
        scorebug.setBounds(345, 675, 100, 50);
        scorebug.setFont(new Font("Arial", Font.PLAIN, 20));
        scorebug.setForeground(Color.WHITE);
        this.add(scorebug);


        point = new JLabel(poi);
        point.setBounds(380,705,50,50);
        this.add(point);
        defenders = d;

        JLabel timeLabel = new JLabel("Time:");
        timeLabel.setBounds(25, 675, 100, 50);
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        timeLabel.setForeground(Color.WHITE);
        this.add(timeLabel);

        timer = new JLabel("60");
        timer.setBounds(30,705,100,50);
        timer.setForeground(Color.WHITE);
        this.add(timer);




        //int check = 0;
        //while(check == 0){
//            JButton button = new JButton("Freshman");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                players = new Player[10];
//            }
//        });
        //check=1;
        //}




        setFocusable(true);
        setLayout(null);




        player0 = new Player(200,710);
        players = new Player[defenders];
        for (int i = 0; i < players.length; i++){
            players[i] = new Player();
        }



        //speed/direction of player


        addKeyListener(new KeyAdapter() {




            private int speed = 8;




            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println(e);




                if (e.getKeyCode() == 16) {
                    speed = 16;
                }




                if (e.getKeyCode() == 68 || e.getKeyCode() == 39) {
                    //right
                    player0.setX(player0.getX() + speed);
                } else if (e.getKeyCode() == 65 || e.getKeyCode() == 37) {
                    //left
                    player0.setX(player0.getX() - speed);
                } else if (e.getKeyCode() == 83 || e.getKeyCode() == 40) {
                    //up
                    player0.setY(player0.getY() + speed);
                } else if (e.getKeyCode() == 87 || e.getKeyCode() == 38) {
                    //down
                    player0.setY(player0.getY() - speed);
                }








//                else if (e.getKeyCode() == 16){
//                    //boost
//                    player0.setY(player0.getY()-16);
//                }
            }




            @Override
            public void keyReleased(KeyEvent e){
                if (e.getKeyCode() == 16) {
                    speed = 8; // Reset speed when Shift is released
                }
            }


        });






        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                //System.out.println(e);
                if (!gameOver && !timeUp) {
                    if (change == 0) {
                        //System.out.println("0");
                        endzone.setText("PENN STATE");
                        endzone.setForeground(Color.BLUE);
                        change++;
                    } else if (change == 1) {
                        //System.out.println("1");
                        endzone.setText("OHIO STATE");
                        endzone.setForeground(Color.RED);
                        change++;
                    } else if (change == 2) {
                        //System.out.println("2");
                        endzone.setText("ALABAMA");
                        endzone.setForeground(Color.RED);
                        change++;
                    } else if (change == 3) {
                        endzone.setText("ILLINOIS");
                        endzone.setForeground(new Color(247, 169, 79));
                        change++;
                    } else if (change == 4) {
                        endzone.setText("MICHIGAN STATE");
                        endzone.setForeground(new Color(17, 133, 25));
                        change++;
                    } else if (change == 5) {
                        endzone.setText("INDIANA");
                        endzone.setForeground(Color.RED);
                        change++;
                    } else if (change == 6) {
                        endzone.setText("IOWA");
                        endzone.setForeground(new Color(255, 193, 23));
                        change++;
                    } else if (change == 7) {
                        endzone.setText("GEORGIA");
                        endzone.setForeground(Color.RED);
                        change++;
                    } else if (change == 8) {
                        endzone.setText("OREGON");
                        endzone.setForeground(new Color(17, 209, 30));
                        change++;
                    } else if (change == 9) {
                        endzone.setText("WISCONSIN");
                        endzone.setForeground(Color.RED);
                        change++;
                    } else if (change == 10) {
                        endzone.setText("USC");
                        endzone.setForeground(Color.RED);
                        change++;
                    } else if (change == 11) {
                        endzone.setText("TEXAS");
                        endzone.setForeground(new Color(242, 147, 39));
                        change++;
                    } else if (change == 12) {
                        endzone.setText("LSU");
                        endzone.setForeground(new Color(178, 27, 242));
                        change++;
                    } else if (change == 13) {
                        endzone.setText("TENNESSEE");
                        endzone.setForeground(new Color(242, 147, 39));
                        change++;
                    } else if (change == 14) {
                        endzone.setText("NOTRE DAME");
                        endzone.setForeground(Color.GREEN);
                        change++;
                    } else if (change == 15) {
                        endzone.setText("ARIZONA STATE");
                        endzone.setForeground(Color.RED);
                        change++;
                    } else if (change == 16) {
                        endzone.setText("ENDZONE");
                        endzone.setForeground(Color.WHITE);
                        change = 0;
                    }
                }
            }
        });




        endzone = new JLabel("ENDZONE");
        endzone.setFont(new Font("Arial", Font.BOLD, 30));
        endzone.setForeground(Color.WHITE);
        endzone.setHorizontalAlignment(SwingConstants.CENTER);
        endzone.setBounds(0, 20, 450, 50);
        this.add(endzone);




        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {


                if (gameOver) {
                    restart();
                }


            }
        });




//        addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                if (change == 0){
//                    System.out.println("0");
//                endzone.setText("PENN STATE");
//                change++;
//                }
//                else if (change == 1){
//                    System.out.println("1");
//                    endzone.setText("OHIO STATE");
//                    change++;
//                }
//                else if (change == 2){
//                    System.out.println("2");
//                    endzone.setText("ALABAMA");
//                    change++;
//                }
//            }
//        });




    }



    private boolean gameOver = false;





    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        g.setColor(Color.BLACK);
//        g.fillOval(200,710,30,30);



        System.out.println(!timeUp);

        //System.out.println(gameOver);


        point.setText(player0.getPoints() + "");
        point.setFont(new Font("Arial", Font.PLAIN, 30));
        point.setForeground(Color.WHITE);

        timer.setFont(new Font("Arial", Font.PLAIN, 30));
        point.setForeground(Color.WHITE);



        if (gameOver) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            if (timeUp){
                g.drawString("TIMES UP!", 130, 350);
                g.drawString("YOUR SCORE: " + player0.getPoints(), 80, 400);
            }
            else if (win) {
                g.drawString("TOUCHDOWN!", 90, 350);
            }
            else if (tackle) {
                g.drawString("TACKLED!", 130, 350);
            }
            else{
                g.drawString("OUT OF BOUNDS!", 60, 350);
            }
            return;
        }








        g.setColor(Color.WHITE);
        g.drawLine(0, 95, 450, 95);
        g.drawLine(0, 195, 450, 195);
        g.drawLine(0, 295, 450, 295);
        g.drawLine(0, 395, 450, 395);
        g.drawLine(0, 495, 450, 495);
        g.drawLine(0, 595, 450, 595);
        g.drawLine(0, 685, 450, 685);
        g.drawLine(0, 795, 450, 795);




        //hashes




        g.drawLine(45, 85, 45, 105);
        int x = 45;
        int y1 = 85;
        int y2 = 105;
        //g.drawLine(45, 185, 45, 205);
        for(int i = 0; i < 5; i++) {
            y1+=100;
            y2+=100;
            g.drawLine(x, y1, x, y2);
        }
        g.drawLine(405,85,405,105);
        int xx = 405;
        int yy1 = 85;
        int yy2 = 105;
        for (int i = 0; i < 5; i++){
            yy1+=100;
            yy2+=100;
            g.drawLine(xx, yy1, xx, yy2);
        }




        player0.draw(g);
        for (int i = 0; i < players.length; i++){
            players[i].dDraw(g);
            //players[i].draw(g);
            player0.playerDraw(g);
            players[i].move();
            players[i].bounds(this);
            player0.checkDefeat(players[i], this);
            player0.playerBounds(this);
        }




//        for(Player p: players){
//            p.draw(g);
//        }




        //if (!gameOver) {
        try {
            Thread.sleep(25);
        } catch (Exception e) {




        }
        //}




        repaint();
    }

    public void setGameOver(boolean gameOver, boolean win, boolean tackle) {




        //System.out.println(gameOver);
        this.gameOver = gameOver;
        this.win = win;
        this.tackle = tackle;


        if (gameOver) {
            repaint();
        }




    }




    public void restart(){
        player0.setX(200);
        player0.setY(710);
        player0.setTd(false);




        for (Player p : players) {
            p.setX((int) (Math.random() * 400) + 20);
            p.setY((int) (Math.random() * 680) + 10);
        }




        gameOver = false;
        tackle = false;
        timeUp = false;








//        endzone.setText("ENDZONE");
//        endzone.setForeground(Color.WHITE);




        //System.out.println("Restarting game...");




        repaint();
    }




}
