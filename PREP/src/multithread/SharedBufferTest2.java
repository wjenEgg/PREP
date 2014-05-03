package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedBufferTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService application = Executors.newFixedThreadPool(2);
		Buffer sharedLocation = new SynchronizedBuffer();
		System.out.printf("%-40s%s\t\t%s\n%-40s%s\n\n", "Operation","Buffer","Occupied","----------","--------\t\t-------");
		try {
			application.execute(new Producer(sharedLocation));
			application.execute(new Consumer(sharedLocation));
		} catch (Exception exception){
			exception.printStackTrace();
		}
		application.shutdown();
	}

}
