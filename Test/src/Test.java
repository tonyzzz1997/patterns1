public class Test{
	String name;

	Test() {

	}

	Test(String name) {
	this.name = name;
	}

	void setName(String name) {
	this.name = name;
	}

	void getName() {
	System.out.print(name);
	}

	public static void main(String[] args) {
	Test cpp = new Test();
	Test java = new Test("Java");
	cpp.setName("C++");
	java.getName();
	cpp.getName();
	}
	}
