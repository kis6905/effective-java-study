package practice;

public class Item22 {

	public static void main(String[] args) {
		System.out.println(MyInterface.aaa);
		System.out.println(MyClass.aaa);
		System.out.println(MyClass2.aaa);
		
		MyClass my = new MyClass();
		my.println();
		
		MyClass2 my2 = new MyClass2();
		my2.print();
	}
}

class MyClass2 extends MyClass {
	void print() {
		System.out.println(aaa);
	}
}

class MyClass implements MyInterface {
//	static final int aaa = 10;
	
	void println() {
		System.out.println(aaa);
	}
}

interface MyInterface {
	static final int aaa = 5;
}
