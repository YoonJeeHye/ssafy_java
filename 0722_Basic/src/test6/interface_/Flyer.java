package test6.interface_;

public interface Flyer {
	public void fly();
	
	default public void repairWing() {
		System.out.println(">>>������ �����մϴ�.");
	}
}
