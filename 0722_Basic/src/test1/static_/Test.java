package test1.static_;

public class Test {

	public static void main(String[] args) {
		//Shop s = new Shop();
		Shop s = Shop.getInstance();
		s.addPrint();
		
		//Shop s2 = new Shop();
		Shop s2 = Shop.getInstance();
		s2.addPrint();

		System.out.println(s == s2);
	}

}
