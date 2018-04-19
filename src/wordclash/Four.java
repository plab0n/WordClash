
package wordclash;

import javax.swing.JOptionPane;

public class Four {
    String name4[] = {"EXPLANATION","DEPARTMENT","DISCOVER","ENVIRONMENT","MEDICINE"};
    public Four(int k)
    {
        if(name4.length==k)
        {
            JOptionPane.showMessageDialog(null,"Completed!! Update are coming soon");
        }
        new FrameMaker(5,name4[k],name4[k].length());
    }
}
