package practice;

import java.util.Objects;
import java.util.stream.IntStream;

public class Item49 {

	public static void main(String[] args) {
		System.out.println(sum(1, 2));
		System.out.println(sum(1, 3));
		
		int[] a = { 1, 2, 3 };
		System.out.println(sum2(a));
		System.out.println(sum2(null));
	}
	
	public static Integer sum(Integer a, Integer b) {
		Objects.requireNonNull(a, "a 는 필수");
		Objects.requireNonNull(b, "b 는 필수");
		return a + b;
	}
	
	public static Integer sum2(int[] a) {
		assert a != null; // need to vm option (-ea)
		return IntStream.of(a)
			.sum();
	}

}
