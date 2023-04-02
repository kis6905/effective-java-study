package practice;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Item48 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		pi(1_000_000);
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000. + " ms.");
	}
	
	static long pi(long n) {
		return LongStream.rangeClosed(2, n)
				.mapToObj(BigInteger::valueOf)
				.filter(i -> i.isProbablePrime(50))
				.count();
	}
	
	static long piWithParallel(long n) {
		return LongStream.rangeClosed(2, n).parallel()
				.mapToObj(BigInteger::valueOf)
				.filter(i -> i.isProbablePrime(50))
				.count();
	}

}
