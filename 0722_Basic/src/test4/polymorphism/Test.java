package test4.polymorphism;

public class Test {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
				
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	}

}

class A{
	@Override
	public String toString() {
		return "A" + hashCode();
	}
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		return hashCode()==obj.hashCode();
	}
}