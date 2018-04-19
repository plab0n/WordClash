
package wordclash;

public class Two {
    public String name2[] = {"BEHAVIOR","BELIEF","REALITY","ASSET","FRAME"};
    
    public Two(int j)
    {
        if(j==name2.length){
            new FrameMaker();
            new Three(0);
        }
        else
        new FrameMaker(3,name2[j],name2[j].length());
    }
    
}
           