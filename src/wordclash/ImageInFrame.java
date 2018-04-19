package wordclash;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageInFrame extends JFrame{
    int counter;
    public Timer timer;
  
    public JFrame f = new JFrame();
    public ImageInFrame() throws IOException {
        String path = "E:\\academic_study\\Java\\PSD\\WordClash\\src\\wordclash\\unnamed.jpg";
        File file = new File(path);
        BufferedImage image = ImageIO.read(file);
        JLabel label = new JLabel(new ImageIcon(image));
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(label);
        f.pack();
        f.setLocation(100,100);
        f.setVisible(true);
        time();
        
    }
    public void time()
    {
        JLabel promotLabel,timerlabel;
    int counter;
    
        
            int count = 6;
            TimeClass tc= new TimeClass(count);
            timer = new Timer(1000, tc);
            
            timer.start();
    }
    
    
    public class TimeClass implements ActionListener{
        int counter;
        public TimeClass(int counter){
            this.counter=counter;
            //System.out.println("hgfhg");
        }
        
        
        public void actionPerformed(ActionEvent e){
            counter--;
            
            if(counter<=0){
                
//                timer.stop();
                f.setVisible(false);
                new Login();
                if(timer.isRunning())
                    timer.stop();
            }
            
        }

    }


}
