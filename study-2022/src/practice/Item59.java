package practice;

import java.util.concurrent.ThreadLocalRandom;

public class Item59 {

	public static void main(String[] args) {
		int loopCount = 10000;
		
		System.out.println("Random");
		testWithRandom(loopCount);
		System.out.println("==========================");
		System.out.println("ThreadLocalRandom");
		testWithThreadLocalRandom(loopCount);
	}
	
	public static void testWithThreadLocalRandom(int loopCount) {
		int countOflessThan51 = 0; // 51 미만(0 ~ 50)
		int countOfmoreThan50 = 0; // 50 초과(51 ~ 100)
		
		for (int i = 0; i < loopCount; i++) {
			int a = ThreadLocalRandom.current().nextInt(100);
			if (a < 51) {
				countOflessThan51++;
			} else {
				countOfmoreThan50++;
			}
		}
		System.out.println("0 ~ 50 개수: " + countOflessThan51);
		System.out.println("51 ~ 100 개수: " + countOfmoreThan50);
	}
	
	public static void testWithRandom(int loopCount) {
		int countOflessThan51 = 0; // 51 미만(0 ~ 50)
		int countOfmoreThan50 = 0; // 50 초과(51 ~ 100)
		
		for (int i = 0; i < loopCount; i++) {
			int a = (int) (Math.random() * 100);
			if (a < 51) {
				countOflessThan51++;
			} else {
				countOfmoreThan50++;
			}
		}
		System.out.println("0 ~ 50 개수: " + countOflessThan51);
		System.out.println("51 ~ 100 개수: " + countOfmoreThan50);
	}
	
}
