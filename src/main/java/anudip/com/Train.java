package anudip.com;

public class Train implements Travel{
	

	    private String DistanceCovered; 

	    public Train() {
	        System.out.println("Train journey has started");
	    }

	    public String getDistanceCovered() {  
	        return DistanceCovered;
	    }

	    public void setDistanceCovered(String distanceCovered) { 
	        this.DistanceCovered = distanceCovered;
	    }

	    @Override
	    public String toString() {
	        return "Train [DistanceCovered=" + DistanceCovered + "]"; 
	    }

	    
	    public void journey() {
	        System.out.println("The Train has covered a distance of 3km");
	    }

	    
	    public void cost() {
	        System.out.println("The cost of train travel is 2000rs");
	    }
	}


