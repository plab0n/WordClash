
package wordclash;

import sun.audio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Audio extends JFrame{
    public JFrame fr;
    public JButton btn;
    public Audio(){
        
        AudioPlayer bgp = AudioPlayer.player;
        AudioStream bgm;
        AudioData MD;
    
        ContinuousAudioDataStream loop = null;
        
        try{
            bgm = new AudioStream(new FileInputStream("Game of Thrones Theme.wav"));
            MD = bgm.getData();
            loop = new ContinuousAudioDataStream(MD);
        }
        catch(IOException ex){
        
        }
    
        bgp.start(loop);
    }
}
