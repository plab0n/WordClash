package wordclash;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Option extends JFrame{
    public JFrame fr;
    
    protected JPanel p1,p2,p3;
    protected JSlider slider;
    protected JLabel lb1,lb2,lb3,lb4;
    protected JCheckBox cb1,cb2;
    protected JButton btn;
    protected JRadioButton on,off;
    public Font ft = new Font("Matura MT Script Capitals",Font.BOLD,20);
    
    public Option(){

        fr= new JFrame();
        fr.setTitle("Word Clash");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500,600);
        fr.setVisible(true);
        fr.validate();
        
        p1 = new JPanel();
        p1.setBackground(Color.DARK_GRAY);
        lb1 = new JLabel("<html><h1>Sound </h1></html>");
        lb1.setForeground(Color.WHITE);
        lb1.setFont(ft);
        p1.add(lb1);
        
//        cb1= new JCheckBox("On");
//        cb2= new JCheckBox("Off");
        on = new JRadioButton("On");
        off = new JRadioButton("Off");
        ButtonGroup group = new ButtonGroup();
        group.add(on);
        group.add(off);
        
        on.setFont(ft);
        off.setFont(ft);
        p1.add(on);
        p1.add(off);
        
        
        fr.add(p1);
        
        p2 = new JPanel();
        p2.setBackground(Color.LIGHT_GRAY);
        lb2 = new JLabel("<html><h1>Difficulty Laval </h1></html>");
        lb2.setFont(ft);
        p2.add(lb2);
        
        slider=new JSlider(JSlider.HORIZONTAL, 1, 5, 1);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setBackground(Color.LIGHT_GRAY);
        p2.add(slider);
        event e =new event();
        slider.addChangeListener( e);
        
        lb3= new JLabel("<html><h1>Beginner...</h1></html>");
        lb3.setFont(ft);
        p2.add(lb3);
        
        fr.add(p2);
        
        
        p3 = new JPanel();
        p3.setBackground(Color.DARK_GRAY);
        btn = new JButton("Back");
        btn.setForeground(Color.black);
        btn.setFont(ft);
        p3.add(btn);
        event2 e2 = new event2();
        btn.addActionListener(e2);
        
        
        fr.add(p3);
        
        fr.add(p1,BorderLayout.PAGE_START);
        fr.add(p2,BorderLayout.CENTER);
        fr.add(p3,BorderLayout.PAGE_END);
    }
    
    public class event implements ChangeListener{
        public void stateChanged(ChangeEvent e){
            int value = slider.getValue();
            
            if(value==1){
                lb3.setText("<html><h1>Beginner...</h1></html>");
                lb3.setFont(ft);
            }
            else if(value==2){
                lb3.setText("<html><h1>  Easy...</h1></html>");
                lb3.setFont(ft);
            }
            else if(value==3){
                lb3.setText("<html><h1>Mediume...</h1></html>");
                lb3.setFont(ft);
            }
            else if(value==4){
                lb3.setText("<html><h1>  Hard...</h1></html>");
                lb3.setFont(ft);
            }
            else if(value==5){
                lb3.setText("<html><h1>Professional...</h1></html>");
                lb3.setFont(ft);
            }
            
            
        }
    }
    
    public class event2 implements ActionListener{
        public void actionPerformed(ActionEvent e2){
            Toolkit.getDefaultToolkit().beep();
            new GameDemo();
            fr.setVisible(false);
        }
    }
    
    
}
