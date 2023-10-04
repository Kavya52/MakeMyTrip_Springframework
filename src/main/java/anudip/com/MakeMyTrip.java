package anudip.com;

public class MakeMyTrip {
	Travel travel;
	
	public MakeMyTrip() {
		System.out.println("Planning for trip");
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	@Override
	public String toString() {
		return "MakeMyTrip [travel=" + travel + "]";
	}
	

}
