/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordclash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Credits extends JFrame{
    protected JFrame frm;
    protected JLabel lb,lb2;
    protected JButton btn,btn1,btn2,btn3;
    protected JPanel p1,p2,p3;
    protected Font ft = new Font("Matura MT Script Capitals",Font.BOLD,25);
    public Credits(){
        frm = new JFrame();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(500,600);
        frm.setTitle("Credit's");
        frm.setVisible(true);
        frm.setResizable(false);
        p2 = new JPanel(new BorderLayout());
        p2.setBackground(Color.LIGHT_GRAY);
        lb2 = new JLabel();
        
        lb2.setText("<html>"
                        + "<h1>Created By: </h1>"
                        + "<h1>Error_hunters</h1> "
                        + "<h2>The students of Computer Science and Engineering</h2>"
                        + "<h1>International University of Business Agriculture and Technology (IUBAT), Dhaka, Bangladesh.</h1> "
                        + "<h2>Team Details: </h2>"
                        + "<h2>Plabon Kumar Biswas</h2>"
                        + "<h2>Debotush Dam</h2>"
                        + "<h2>Md. Kamran Hasan Shimul</h2>"
                        + "<h2>Tania Sultana Jui</h2>"
                        + " </html>");
        lb2.setFont(ft);
        lb2.setForeground(Color.DARK_GRAY);
        p2.add(lb2);
        frm.add(p2);
        
        btn = new JButton("Back");
        btn.setSize(200,100);
        btn.setBackground(Color.DARK_GRAY);
        btn.setForeground(Color.WHITE);
        btn.setFont(ft);
        p2.add(btn);
        
        
        
        event e = new event();
        btn.addActionListener(e);
       
        p2.add(lb2,BorderLayout.NORTH);

    }
    
    public class event implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Toolkit.getDefaultToolkit().beep();
            new GameDemo();
            frm.setVisible(false);
        }
    } 
    
}
