package practice;

public class TestInitializer {
	int i = meth1();
	int meth1() {
		System.out.println("Hi");
		return 99;
	}
	public static void main(String[] args) {
		new TestInitializer().meth1();
		System.out.println(new TestInitializer().i);
	}
}
