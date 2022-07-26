package test6.interface_;

public abstract class Vehicle {
	
	private String from, to;
	
	public abstract void move(String from, String to);

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	

}
