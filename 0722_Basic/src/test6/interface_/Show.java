package test6.interface_;

public class Show {
	
	public static void airShow(Flyer f) {
	f.fly();
	}
	
	public static void readyShow() {
		//f.repairWing();
		Flyer.repairWing();
	}
}
