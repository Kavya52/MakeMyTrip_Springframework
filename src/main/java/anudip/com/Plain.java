package anudip.com;

public class Plain implements Travel{
	
	 private String DistanceCovered; 

	    public Plain() {
	        System.out.println("Plain journey has started");
	    }

	    public String getDistanceCovered() {  
	        return DistanceCovered;
	    }

	    public void setDistanceCovered(String distanceCovered) { 
	        this.DistanceCovered = distanceCovered;
	    }

	    @Override
	    public String toString() {
	        return "Plain [DistanceCovered=" + DistanceCovered + "]"; 
	    }

	   
	    public void journey()
	    {
	        System.out.println("The plain has covered a distance of 5000km" );
	    }

	    
	    public void cost()
	    {
	        System.out.println("The cost of plain travel is 12000rs");
	    }
	}



