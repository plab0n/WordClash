package wordclash;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Help extends JFrame{
    protected JTextArea ta;
    protected JLabel lb;
    protected JFrame f;
    protected JPanel panel,p2,p3;
    protected JButton back;
    protected Font ft = new Font("Matura MT Script Capitals",Font.BOLD,25);
    protected Font ft2 = new Font("Matura MT Script Capitals",Font.PLAIN,25);
    public Help(){
//        f.setLayout(new FlowLayout());
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,600);
        f.setTitle("Help");
        f.setVisible(true);
        f.setResizable(false);
        lb = new JLabel();
        
       
        
        lb.setText("<html>"                        
                        + "<h1>“Word Clash” is an awesome puzzle game.<h1>"
                        + "<h3>This game is slightly different from "
                        + "other puzzle games because in here player "
                        + "need to play the game using the words. So, "
                        + "player feel it very much interesting and "
                        + "challenging to play “Word Clash”. “Word "
                        + "Clash” is being divided into several "
                        + "difficulty levels. Each level has been "
                        + "into several stages. In each stages divided, "
                        + "there are some puzzle words are being placed. "
                        + "Player needs to make a meaningful word using "
                        + "those puzzle words. In a word, the main "
                        + "objective of the game is to make a "
                        + "meaningful word using the given puzzle "
                        + "words. Player needs to match and make a "
                        + " meaning full words as requested in each "
                        + " levels. At first all the levels as well "
                        + "as the stages will be locked except the first "
                        + " one. If player successfully finished first stage, "
                        + " then the next stage will be unlocked. Players "
                        + "need to play to unlock the all stages of all the "
                        + "levels.</h3> "
                        + "<p>      </p>"
                        + "<p>      </p>"
                        + "<p>      </p>"
                        + " </html>");
        lb.setFont(ft2);
        panel = new JPanel(new BorderLayout());
        panel.add(lb);
        f.add(panel);
        panel.setVisible(true);
        panel.setBackground(Color.WHITE);
        
        back = new JButton("Back");
        back.setSize(200,100);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.WHITE);
        
        
        back.setFont(ft);
        panel.add(back);
  
        panel.add(lb, BorderLayout.NORTH);
        
        event e = new event();
        back.addActionListener(e);
    }
    
    public class event implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Toolkit.getDefaultToolkit().beep();
            new GameDemo();
            f.setVisible(false);
        }
    }
}
