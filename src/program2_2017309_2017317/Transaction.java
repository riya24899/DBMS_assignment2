package program2_2017309_2017317;
import java.lang.Math;
import java.lang.Thread;
public class Transaction implements Runnable {

	private int type;
	private int tid;
	private static int counter=1;
	
	Transaction(){
		this.tid=counter;
		counter++;
	}

	
	
	
	
	
	
	
	
	
	
//	Transaction (){
//	this.type=(int)(Math.random()*4)+1;
//	}
//	
//	public void reserve(String F, int i) throws InterruptedException {
//		if(CCM.getFdLock().equalsIgnoreCase("X") || CCM.getPdLock().equalsIgnoreCase("X")) {
//			this.wait();
//		}
//		if (CCM.getPdLock()==null && CCM.getFdLock()==null) {
//			CCM.lockXFlightDatabase();
//			CCM.lockXPassengerDatabase();
//		}
	
	
	public void run() {
		switch(this.type) {
		case 1: 
			
		}
	}
}
