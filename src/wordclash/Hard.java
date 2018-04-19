
package wordclash;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hard {
    public JButton b1,b2,b3,b4,b5,b6;
    public JFrame f = new JFrame();
    public Font ft = new Font("Matura MT Script Capitals",Font.BOLD,20);
    public boolean stts[] = new boolean[10];
    public Hard(int j)
    {
        stts[j] = true;
    }
    public Hard(){
        f.setTitle("Hard Stage");
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setBounds(100,100,500,600);
        f.setLayout(null);
        
        f.getContentPane().setBackground(Color.darkGray);
         
        b1 = new JButton("Level One");      
        b1.setBounds(160,100,200,50);
        b1.setBackground(Color.WHITE);
        b1.setFont(ft);
        f.add(b1);
            
        b2 = new JButton("Level Two");      
        b2.setBounds(160,160,200,50);
        b2.setBackground(Color.WHITE);
        b2.setFont(ft);
        f.add(b2);
            
        b3 = new JButton("Level Three");    
        b3.setBounds(160,220,200,50);
        b3.setBackground(Color.WHITE);
        b3.setFont(ft);
        f.add(b3);
            
        b4 = new JButton("Level Four");     
        b4.setBounds(160,280,200,50);
        b4.setBackground(Color.WHITE);
        b4.setFont(ft);
        f.add(b4);
            
        b5 = new JButton("Level Five");    
        b5.setBounds(160,340,200,50);
        b5.setBackground(Color.WHITE);
        b5.setFont(ft);
        f.add(b5);
            
        b6 = new JButton("Main Menu");    
        b6.setBounds(160,400,200,50);
        b6.setBackground(Color.WHITE);
        b6.setFont(ft);
        f.add(b6);
        
        event1 e1 = new event1();
        b1.addActionListener(e1);
            
        event2 e2 = new event2();
        b2.addActionListener(e2);
            
        event3 e3 = new event3();
        b3.addActionListener(e3);
            
        event4 e4 = new event4();
        b4.addActionListener(e4);
            
        event5 e5 = new event5();
        b5.addActionListener(e5);
            
        event6 e6 = new event6();
        b6.addActionListener(e6);
    }
    
    public class event1 implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            Toolkit.getDefaultToolkit().beep();
            if(stts[0])
                new Four(0);
        }
    }
    
    public class event2 implements ActionListener{
        public void actionPerformed(ActionEvent e2){
            Toolkit.getDefaultToolkit().beep();
            if(stts[1])
                new Four(1);
        }
    }
    
    public class event3 implements ActionListener{
        public void actionPerformed(ActionEvent e3){
            Toolkit.getDefaultToolkit().beep();
            if(stts[2])
                new Four(2);
            
        }
    }
    
    public class event4 implements ActionListener{
        public void actionPerformed(ActionEvent e4){
            Toolkit.getDefaultToolkit().beep();
            if(stts[3])
                new Four(3);
        }
    }
    
    public class event5 implements ActionListener{
        public void actionPerformed(ActionEvent e5){
            Toolkit.getDefaultToolkit().beep();
            if(stts[4])
                new Four(4);
            
        }
    }
    
    public class event6 implements ActionListener{
        public void actionPerformed(ActionEvent e6){
            Toolkit.getDefaultToolkit().beep();
            new GameDemo();
            f.setVisible(false);
        }
    }
}
