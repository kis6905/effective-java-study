package practice;

import java.io.IOException;

public class Item71 {

	public static void main(String[] args) {
		
	}
	
	// unchecked exception(비검사 예외)
	public static void myFun() {
		throw new IllegalArgumentException();
	}
	
	// checked exception(검사 예외)
	public static void myFun2() throws IOException {
		throw new IOException();
	}
	
}
