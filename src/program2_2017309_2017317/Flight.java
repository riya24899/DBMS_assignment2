package program2_2017309_2017317;

import java.util.ArrayList;

public class Flight {
	private String id;
	private int totalSeats;
	private int reservedSeats;
	private int freeSeats;
	private ArrayList<Passenger> passengerList;
	
	public Flight(String id, int ts, int rs, ArrayList<Passenger> pl) {
		this.id=id;
		this.totalSeats=ts;
		this.reservedSeats=rs;
		this.freeSeats=this.totalSeats-this.reservedSeats;
		this.passengerList=pl;
	}
	
	public ArrayList<Passenger> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(ArrayList<Passenger> passengerList) {
		this.passengerList = passengerList;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getTotalSeats() {
		return totalSeats;
	}
	
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	public int getReservedSeats() {
		return reservedSeats;
	}
	
	public void setReservedSeats(int reservedSeats) {
		this.reservedSeats = reservedSeats;
	}
	
	public int getFreeSeats() {
		return freeSeats;
	}
	
	public void setFreeSeats(int freeSeats) {
		this.freeSeats = freeSeats;
	}
	
}
