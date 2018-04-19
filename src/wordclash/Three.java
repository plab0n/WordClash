
package wordclash;

public class Three {
    String name3[] = {"INVENTORY","BUSINESS","MARKET","OBJECTIVE","TRANSPORT"};
    
    public Three(int j)
    {
        if(name3.length==j)
        {
            new FrameMaker();
            new Four(0);
        }
       new FrameMaker(4,name3[j],name3[j].length());
    }
}
