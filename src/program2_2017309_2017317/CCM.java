package program2_2017309_2017317;

import java.util.ArrayList;
import java.util.*;

public class CCM {

	private static Hashtable<String, Locklist> Locktable= new Hashtable<String, Locklist>();
	
	
	public static synchronized boolean makelockreq( int tid, String itemId, String Locktype) {
		if(!Locktable.contains(itemId)) {
			
			Locklist L= new Locklist();
			Lock entry= new Lock();
			entry.setTid(tid);
			entry.setType(Locktype);
			entry.setGranted(true);
			L.getLlist().add(entry);
			Locktable.put(itemId, L);
			return true;
		}
		else {
			Locklist X =Locktable.get(itemId);
			Lock entry= new Lock();
			entry.setTid(tid);
			entry.setType(Locktype);
			if(X.getLlist().get(X.getLlist().size()-1).getType().equals("X")) {
				entry.setGranted(false);
				return false;
			}
			else /*if(X.getLlist().get(X.getLlist().size()-1).getType().equals("S"))*/ {
				if(entry.getType().equals("X")) {
				entry.setGranted(false);
				return false;
				}
				
				else
					entry.setGranted(true);
				return true;
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	ArrayList <Flight> FlightDatabase;
//	static String fdLock=null;
//	ArrayList <Passenger> PassengerDatabase;
//	static String pdLock=null;
//	
//	public static void lockSFlightDatabase() {
//		fdLock="S";
//	}
//	
//	public static synchronized void lockXFlightDatabase() {
//		fdLock="X";
//	}
//	
//	public static void lockSPassengerDatabase() {
//		fdLock="S";
//	}
//	
//	public static synchronized void lockXPassengerDatabase() {
//		fdLock="X";
//	}
//	
//	public static 
//
//	public ArrayList<Flight> getFlightDatabase() {
//		return FlightDatabase;
//	}
//
//	public void setFlightDatabase(ArrayList<Flight> flightDatabase) {
//		FlightDatabase = flightDatabase;
//	}
//
//	public static String getFdLock() {
//		return fdLock;
//	}
//
//	public static void setFdLock(String fdLock) {
//		CCM.fdLock = fdLock;
//	}
//
//	public ArrayList<Passenger> getPassengerDatabase() {
//		return PassengerDatabase;
//	}
//
//	public void setPassengerDatabase(ArrayList<Passenger> passengerDatabase) {
//		PassengerDatabase = passengerDatabase;
//	}
//
//	public static String getPdLock() {
//		return pdLock;
//	}
//
//	public static void setPdLock(String pdLock) {
//		CCM.pdLock = pdLock;
//	}
	
}
