/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordclash;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static wordclash.Login.tf;

public class GameOver extends JFrame{
    private JLabel lb,lb2,lb3;
    private JButton b1;
    private JFrame f;
    public Font ft2 = new Font("Matura MT Script Capitals",Font.BOLD,30);
    
    public GameOver(String name,String score){
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 600);
        f.setTitle("Word Clash");
        f.setVisible(true);
        f.setLayout(null);
        
        f.getContentPane().setBackground(Color.darkGray);
        
        lb = new JLabel("Game Over");
        lb.setBounds(145,100,300,50);
        lb.setForeground(Color.LIGHT_GRAY);
        lb.setFont(ft2);
        f.add(lb);
        
        lb2 = new JLabel(name);
        lb2.setBounds(145,160,300,50);
        lb2.setForeground(Color.LIGHT_GRAY);
        lb2.setFont(ft2);
        f.add(lb2);
        
        lb3 = new JLabel("Score: "+score);
        lb3.setBounds(145,220,300,50);
        lb3.setForeground(Color.LIGHT_GRAY);
        lb3.setFont(ft2);
        f.add(lb3);
        
        b1 = new JButton("Menu");
        b1.setBounds(175,340,150,50);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setFont(ft2);
        f.add(b1);
        
        event1 e1 = new event1();
        b1.addActionListener(e1);
    }
    
    public class event1 implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            Toolkit.getDefaultToolkit().beep();
            new GameDemo();
            f.setVisible(false);
        }
    }
 
}
