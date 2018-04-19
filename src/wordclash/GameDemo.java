package wordclash;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GameDemo extends JFrame {
    public JButton b,b1,b2,b3,b4,b5,b6;
    public JFrame f = new JFrame();
    public JFrame fr = new JFrame();
    public Font ft = new Font("Matura MT Script Capitals",Font.BOLD,20);
    protected JButton btn1,btn2,btn3,btn4,btn5,btn6;
    protected JPanel p1,p2,p3;
    
    
        public GameDemo() {
            fr.setTitle("Word Clash");
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setBounds(100,100,500,600);
            fr.setLayout(null);
            
            fr.getContentPane().setBackground(Color.darkGray);


            
            b = new JButton("New Game");
            b.setBounds(100,100,300,50);
            b.setBackground(Color.WHITE);
            b.setFont(ft);
            fr.add(b);
            
            b1 = new JButton("Beginner");      
            b1.setBounds(160,100,200,50);
            b1.setBackground(Color.WHITE);
            b1.setFont(ft);
            
            b2 = new JButton("Easy");      
            b2.setBounds(160,160,200,50);
            b2.setBackground(Color.WHITE);
            b2.setFont(ft);
            
            b3 = new JButton("Medium");    
            b3.setBounds(160,220,200,50);
            b3.setBackground(Color.WHITE);
            b3.setFont(ft);
            
            b4 = new JButton("Hard");     
            b4.setBounds(160,280,200,50);
            b4.setBackground(Color.WHITE);
            b4.setFont(ft);
            
            b5 = new JButton("Professional");    
            b5.setBounds(160,340,200,50);
            b5.setBackground(Color.WHITE);
            b5.setFont(ft);
            
            b6 = new JButton("Back");    
            b6.setBounds(160,400,200,50);
            b6.setBackground(Color.WHITE);
            b6.setFont(ft);
            
            event e = new event();
            b.addActionListener(e);
            
            event10 e10 = new event10();
            b2.addActionListener(e10);
            
            event11 e11 = new event11();
            b3.addActionListener(e11);
            
            event12 e12 = new event12();
            b4.addActionListener(e12);
            
            event13 e13 = new event13();
            b5.addActionListener(e13);
            
            event14 e14 = new event14();
            b1.addActionListener(e14);
            
            event15 e15 = new event15();
            b6.addActionListener(e15);
            
            btn2=new JButton("Rank List");
            btn2.setBounds(100, 160, 300, 50);
            btn2.setBackground(Color.WHITE);
            btn2.setFont(ft);
            fr.add(btn2);
        
            p2 = new JPanel();
            p2.setBackground(Color.darkGray);
            
            btn3 =new JButton("Option");
            btn3.setBounds(100, 220, 300, 50);
            btn3.setBackground(Color.WHITE);
            btn3.setFont(ft);
            fr.add(btn3);
                
        
            btn4=new JButton("Help");
            btn4.setBounds(100, 280, 300, 50);
            btn4.setBackground(Color.WHITE);
            btn4.setFont(ft);
            fr.add(btn4);

            p3 = new JPanel();
            p3.setBackground(Color.green);
            
            btn5=new JButton("Credit's");
            btn5.setBounds(100, 340, 300, 50);
            btn5.setBackground(Color.WHITE);
            btn5.setFont(ft);
            fr.add(btn5);

        
        
            btn6=new JButton("Exit");
            btn6.setBounds(100, 400, 300, 50);
            btn6.setBackground(Color.WHITE);
            btn6.setFont(ft);
            fr.add(btn6);

            
            
            event2 e2 = new event2();
            btn2.addActionListener(e2);
            
            event3 e3 = new event3();
            btn3.addActionListener(e3);
            
            event4 e4 = new event4();
            btn4.addActionListener(e4);
            
            event5 e5 = new event5();
            btn5.addActionListener(e5);
            
            event6 e6 = new event6();
            btn6.addActionListener(e6);
                      
}
    
    public class event10 implements ActionListener{
        public void actionPerformed(ActionEvent e10){
            Toolkit.getDefaultToolkit().beep();
            new Easy();
            fr.setVisible(false);
            f.setVisible(false);
        }
    }
    
    public class event11 implements ActionListener{
        public void actionPerformed(ActionEvent e11){
            Toolkit.getDefaultToolkit().beep();
            new Medium();
            fr.setVisible(false);
            f.setVisible(false);
            
        }
    }
    
    public class event12 implements ActionListener{
        public void actionPerformed(ActionEvent e12){
            Toolkit.getDefaultToolkit().beep();
            new Hard();
            fr.setVisible(false);
            f.setVisible(false);
        }
    }
    
    public class event13 implements ActionListener{
        public void actionPerformed(ActionEvent e13){
            Toolkit.getDefaultToolkit().beep();
            new Professional();
            fr.setVisible(false);
            f.setVisible(false);
        }
    }
        
    public class event14 implements ActionListener{
        public void actionPerformed(ActionEvent e14){
            Toolkit.getDefaultToolkit().beep();
            new Beginner();
            fr.setVisible(false);
            f.setVisible(false);
            
        }
    }
    
    public class event15 implements ActionListener{
        public void actionPerformed(ActionEvent e15){
            Toolkit.getDefaultToolkit().beep();
//            System.exit(0);
            fr.setVisible(true);
            f.setVisible(false);
        }
    }
        
    public class event2 implements ActionListener{
        public void actionPerformed(ActionEvent e2){
            Toolkit.getDefaultToolkit().beep();
            
        }
    }
    
    public class event3 implements ActionListener{
        public void actionPerformed(ActionEvent e3){
            Toolkit.getDefaultToolkit().beep();
            new Option();
            fr.setVisible(false);
            
        }
    }
        
    public class event4 implements ActionListener{
        public void actionPerformed(ActionEvent e4){
            Toolkit.getDefaultToolkit().beep();
            new Help();
            fr.setVisible(false);
        }
    }
    
    public class event5 implements ActionListener{
        public void actionPerformed(ActionEvent e5){
            Toolkit.getDefaultToolkit().beep();
            new Credits();
            fr.setVisible(false);
        }
    }
    
    public class event6 implements ActionListener{
        public void actionPerformed(ActionEvent e6){
            Toolkit.getDefaultToolkit().beep();
            System.exit(0);
        }
    }
        
    public class event implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Toolkit.getDefaultToolkit().beep();
            
            f.setTitle("Stage's");
            f.getContentPane().setBackground(Color.DARK_GRAY);
            f.setResizable(false);
            f.setLayout(null);
            f.add(b1); 
            f.add(b2); 
            f.add(b3); 
            f.add(b4); 
            f.add(b5);
            f.add(b6);
            f.setBounds(100,100,500,600);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
            fr.setVisible(false);
       }
    }
  
}
