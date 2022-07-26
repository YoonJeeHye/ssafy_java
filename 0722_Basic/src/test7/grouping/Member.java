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
		// 유효성 검사 했다 치자
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone){
		// 유효성 검사 했다 치자
		this.phone = phone;
	}
	
	
}
