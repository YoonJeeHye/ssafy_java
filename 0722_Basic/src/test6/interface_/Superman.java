package test6.interface_;

public class Superman extends Person implements Flyer {
	
	@Override
	public void eat() {
		System.out.println("������ġ�� �����Ѵ�");
		super.eat();
	}
	
	@Override
	public void fly() {
		System.out.println("���並 �ֳ����� ����...");
	}
}
