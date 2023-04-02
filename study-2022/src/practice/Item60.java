package practice;

import java.math.BigDecimal;

public class Item60 {

	public static void main(String[] args) {
		System.out.println(1.03 - 0.42); // 0.6100000000000001
		System.out.println(1.00 - 9 * 0.10); // 0.09999999999999998
		
		BigDecimal bigDecimal = new BigDecimal("1.00");
		BigDecimal result = bigDecimal.subtract(new BigDecimal("0.90"));
		System.out.println(result.toString()); // 0.10
		
		
	}
	
}
