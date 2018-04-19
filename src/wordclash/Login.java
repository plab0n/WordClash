    
package wordclash;
    
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
    
    
public class Login extends JFrame{
    public JButton b1,b2;
    public Statement stt;
    public JFrame f = new JFrame();
    public Font ft = new Font("Matura MT Script Capitals",Font.BOLD,25);
    public Font ft2 = new Font("Matura MT Script Capitals",Font.BOLD,30);
    JLabel lb;
    public boolean ache = false;
    public static JTextField tf;
    public Login(){
//        f.setLayout(new FlowLayout());
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 600);
        f.setTitle("Word Clash");
        f.setVisible(true);
        f.setLayout(null);
        
        f.getContentPane().setBackground(Color.darkGray);
        
        lb = new JLabel("Player Name");
        lb.setBounds(145,160,300,50);
        lb.setForeground(Color.LIGHT_GRAY);
        lb.setFont(ft2);
        f.add(lb);
        tf = new JTextField(25);
        tf.setBounds(100,220,300,50);
        tf.setFont(ft);
        f.add(tf);
        
        b1 = new JButton("Enter");
        b1.setBounds(175,340,150,50);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setFont(ft);
        f.add(b1);
        
         event1 e1 = new event1();
         b1.addActionListener(e1);
    }
    public class event1 implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            Toolkit.getDefaultToolkit().beep();
              Db ob = new Db();
              ob.log_in(tf.getText());
              
            f.setVisible(false);
        }
    }
    
}
