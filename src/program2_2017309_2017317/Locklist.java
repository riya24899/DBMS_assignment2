package program2_2017309_2017317;

import java.util.ArrayList;

public class Locklist {
	ArrayList <Lock> Llist = new ArrayList<Lock>();
	public Locklist(){
		Llist=new ArrayList<Lock>();
	}
	public ArrayList<Lock> getLlist() {
		return Llist;
	}
	public void setLlist(ArrayList<Lock> llist) {
		Llist = llist;
	}
	
}
