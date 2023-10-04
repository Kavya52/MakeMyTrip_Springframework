package anudip.com;

public class Bus implements Travel {

		    private String DistanceCovered; 

		    public Bus() {
		        System.out.println("Bus journey has started");
		    }

		    public String getDistanceCovered() {  
		        return DistanceCovered;
		    }

		    public void setDistanceCovered(String distanceCovered) { 
		        this.DistanceCovered = distanceCovered;
		    }

		    @Override
		    public String toString() {
		        return "Bus [DistanceCovered=" + DistanceCovered + "]"; 
		    }

		    
		    public void journey() {
		        System.out.println("The bus has covered a distance of 5km");
		    }

		   
		    public void cost() {
		        System.out.println("The cost of bus travel is 3000rs");
		    }
		}
