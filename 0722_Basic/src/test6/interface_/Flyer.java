package test6.interface_;

public interface Flyer {
	public void fly();
	
	default public void repairWing() {
		System.out.println(">>>날개를 수리합니다.");
	}
}
