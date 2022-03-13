package practice;

import java.io.IOException;
import java.sql.SQLException;

public class Item74 {

	public static void main(String[] args) {
		
	}
	
	/**
	 * 시각적으로 구분 안 해주는데?
	 * 
	 * @throws IllegalArgumentException
	 * @throws IOException
	 */
	public static void myFun(int a) throws IOException, SQLException {
		if (a == 0) {
			throw new IOException();
		} else if (a == 0) {
			throw new SQLException();
		} else {
			throw new IllegalArgumentException();
		}
	}
	
}
