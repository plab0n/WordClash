package wordclash;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FrameMaker extends JFrame implements ActionListener {
	static String str[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String word = "";
	public static int num;
	String letter[] = new String[100];
	public JButton done = new JButton("DONE");
	JButton btn[] = new JButton[100];
	public String check[];
	public static int j;
	public boolean stts;
	public int ln ;
        public static int sco = 0;
        public JLabel label;
        public String out = "Word: ";
        public String scr = "SCORE: ";
        public static String s = "0";
        private JLabel label2 = new JLabel(out);
     
        private JButton back = new JButton("CLEAR");
        public Font ft = new Font("Viner Hand ITC",Font.BOLD,15);
         public Font ft2 = new Font("Viner Hand ITC",Font.BOLD,15);
        private JFrame fr = new JFrame();
        private JButton menu = new JButton("MENU");
         private JLabel label3;       
        public FrameMaker()
        {
        		j = 0;
                        word = "";
        }
	public FrameMaker(int l,String name,int length)
	{
                 System.out.println("dfdlfd" +j);
                label2.setFont(ft);
		num = l;
		Random random = new Random();
		int wd = 500;
		int hg = 600;
		
                
		fr.setVisible(true);
		fr.setLayout(null);
		fr.getContentPane().setBackground(Color.DARK_GRAY);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(wd,hg);
                fr.setResizable(false);
                 label = new JLabel(scr);
                 label.setFont(ft);
                 label.setOpaque(true);
            
                 label.setBackground(Color.white);
                 label.setForeground(Color.BLACK);
                label.setBounds(330,5, 80,50);
                label.setFont(label.getFont().deriveFont(18.0f));
                
                
                fr.add(label);
                label3 = new JLabel(s);
                label3.setBackground(Color.white);
                 label3.setForeground(Color.BLACK);
                label3.setBounds(410,5,50,50);
                label3.setOpaque(true);
                label3.setVisible(true);
                label3.setFont(ft);
                fr.add(label3);
                
                label2.setBounds(10,5,250,50);
                label2.setOpaque(true);
                label2.setBackground(Color.WHITE);
                label2.setForeground(Color.blue);
                label2.setFont(label2.getFont().deriveFont(18.0f));
                fr.add(label2);
		//JPanel panel = new JPanel();
		int w = l*100;
		int h = l*50;
		int x = (wd-w)/2;
		int y = (hg-h)/2;
		int tmp = x;
		//int tmp2 = y;
		int i,j,cnt=0,ind2=name.length()-1;
		for(i=1; i<=l; i++)
		{
			tmp = x;
			for(j=1; j<=l; j++)
			{
				if(cnt<length){
				letter[cnt] = name.substring(ind2, ind2+1);
				btn[cnt] = new JButton(letter[cnt]);
                                btn[cnt].setFont(ft);
				}
				else
				{
					letter[cnt] = str[random.nextInt(25)];
					btn[cnt] = new JButton(letter[cnt]);
                                           btn[cnt].setFont(ft);
				}
				btn[cnt].setBackground(Color.WHITE);
				btn[cnt].setBounds(tmp, y, 100, 50);
				btn[cnt].addActionListener(this);
				fr.add(btn[cnt]);
				tmp+=100;
				cnt++;
				ind2--;
			}
			y+=50;
		}
		done.setBackground(Color.white);
                done.setFont(ft2);
		done.addActionListener(this);
                
                x = wd/5;
                y = y+50;
               
		done.setBounds(x, y, 100, 50);
		fr.add(done);
                back.setBackground(Color.white);
                back.addActionListener(this);
                back.setFont(ft2);
                back.setBounds(x+=100, y, 100, 50);
                fr.add(back);
                back.addActionListener(this);
                menu.setBounds(x+100, y, 100, 50);
                menu.setBackground(Color.white);
                menu.setFont(ft2);
                fr.add(menu);
                menu.addActionListener(this);
                
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==done)
		{
			//search
			Db ob = new Db();
			//System.out.println(ob.check(word));
			try {
				if(word.length()>1 && ob.check(word.toLowerCase())){ 
                                         sco+=word.length();
                                          s = Integer.toString(sco);
                                         label3.setText(s);
                                        
                                    word = "";
				                    if(num==2){
                                                        ++j;
                                                        fr.setVisible(false);
                                                        new Beginner(j);
				                    	new One(j);
                                                    }
				                    if(num==3){
				                        ++j;
                                                        fr.setVisible(false);
                                                        new Easy(j);
				                    	new Two(j);
                                                    }
				                    if(num==4){
				                        ++j;
                                                        fr.setVisible(false);
                                                        new Medium(j);
				                    	new Three(j);
                                                    }
				                    if(num==5){
                                                        fr.setVisible(false);
                                                        ++j;
                                                        new Hard(j);
				                        new Four(j);
                                                    }
				}
                                else
                                {
                                    JOptionPane.showMessageDialog(null,"INVALID WORD!");
                                     fr.setVisible(false);
                                    ob.update_score(s);
                                }
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  
		}
                if(e.getSource()==back)
                {
                    word = "";
                    out = "Word: ";
                    label2.setText(out);
                }
                if(e.getSource()==menu)
                {
                    fr.setVisible(false);
                    new GameDemo();
                }
		else{
			for(int i=0; i<num*num; i++)
			{
				if(e.getSource()==btn[i])
				{
					word+=letter[i];
					label2.setText(out+=letter[i]);
				}
			}
			
		}
	}
	
}
