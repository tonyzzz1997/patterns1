
public class Language {
	String name;

	Language() {

	}

	Language(String name) {
	this.name = name;
	}

	void setName(String name) {
	this.name = name;
	}

	void getName() {
	System.out.print(name);
	}

	public static void main(String[] args) {
	Language cpp = new Language();
	Language java = new Language("Java");
	cpp.setName("C++");
	java.getName();
	cpp.getName();
	}
}
