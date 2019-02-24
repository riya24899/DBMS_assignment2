package program2_2017309_2017317;

public class Lock {
	int tid;
	String type;
	boolean granted;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public boolean isGranted() {
		return granted;
	}
	public void setGranted(boolean granted) {
		this.granted = granted;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
