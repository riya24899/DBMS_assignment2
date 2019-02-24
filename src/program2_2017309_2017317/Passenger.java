package program2_2017309_2017317;

import java.util.ArrayList;

public class Passenger {
	private String id;
	private ArrayList<Flight> reservedFlights;
	
	public Passenger(String id) {
		this.id=id;
		reservedFlights = new ArrayList<Flight>();
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public ArrayList<Flight> getReservedFlights() {
		return reservedFlights;
	}
	
	public void setReservedFlights(ArrayList<Flight> reservedFlights) {
		this.reservedFlights = reservedFlights;
	}
}
