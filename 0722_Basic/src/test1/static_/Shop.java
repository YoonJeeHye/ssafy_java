package test1.static_;

public class Shop {
	
	static int count;
	private static Shop s;	// static 메서드 안에서는 static 변수만 쓸 수 있어서
	
	public static Shop getInstance() {
		if (s==null) {
			s = new Shop();
		}
		return s;
	}
	
	private Shop() {
		super();
	}
	
	public void addPrint() {
		System.out.println(++count);
	}

}

// private 생성자 만들기
// public static 자신을 return하는 메서드 만들기
// 그 메서드 안에서 딱 한 번만 객체 생성할 수 있게 하기