package wordclash;

public class One {
		static String str = "";
		public String name[] = {"COOL","LOOK","GOOD","FINE","CAT"}; 
		public One(int i)
		{	
                        if(i==name.length){
                            new FrameMaker();
                            new Two(0);
                        
                        }
                        else
			new FrameMaker(2,name[i],name[i].length());
			
		}
		
	
}
