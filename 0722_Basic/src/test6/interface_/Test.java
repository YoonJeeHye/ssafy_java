package test6.interface_;

public class Test {

	public static void main(String[] args) {
		Bird b = new Bird();
		Superman s = new Superman();
		Airplane a = new Airplane();
		// 이 3개를 Flyer b = new Bird(); 이런 식으로 해도 괜찮음
		
		Flyer allFlyer[] = new Flyer[3];
		allFlyer[0]=b;
		allFlyer[1]=s;
		allFlyer[2]=a;
		
		for(Flyer f: allFlyer)
		{
			Show.readyShow(f);
			Show.airShow(f);
		}
		/*
		Show.airShow(b);
		Show.airShow(s);
		Show.airShow(a);
		*/
		//Show.airShow("hello");
	}

}
