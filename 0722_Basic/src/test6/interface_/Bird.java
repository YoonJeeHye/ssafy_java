package test6.interface_;

public class Bird extends Animal implements Flyer{

	@Override
	public void eat() {
		System.out.println("������ �԰� ���...");

	}
	
	@Override
	public void fly() {
		System.out.println("������ �޷��̸� ����...");

	}

}
