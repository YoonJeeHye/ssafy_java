package test7.grouping;

public class Member implements Order8, Subwayer{
	private String name, phone;

	public Member(String name, String phone) {
		super();
		setName(name);
		setPhone(phone);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// ��ȿ�� �˻� �ߴ� ġ��
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone){
		// ��ȿ�� �˻� �ߴ� ġ��
		this.phone = phone;
	}
	
	
}
