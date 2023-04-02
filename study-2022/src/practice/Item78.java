package practice;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class Item78 {

	public static void main(String[] args) throws InterruptedException {
//		StopThread.testStopThread();
		
		AtomicLong aLong = new AtomicLong(5);
		System.out.println(aLong.addAndGet(3));
	}
	
}

class StopThread {
	private static volatile boolean stopRequested;
	
	public static void testStopThread() throws InterruptedException {
		Thread backgroundThread = new Thread(() -> {
			int i = 0;
			while (!stopRequested) {
				System.out.println(i++);
			}
		});
		backgroundThread.start();
		
		TimeUnit.SECONDS.sleep(1);
		stopRequested = true;
	}
}
