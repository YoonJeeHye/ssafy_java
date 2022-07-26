package test1.static_;

public class Shop {
	
	static int count;
	private static Shop s;	// static �޼��� �ȿ����� static ������ �� �� �־
	
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

// private ������ �����
// public static �ڽ��� return�ϴ� �޼��� �����
// �� �޼��� �ȿ��� �� �� ���� ��ü ������ �� �ְ� �ϱ�