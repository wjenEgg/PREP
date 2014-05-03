package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedBufferTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService application = Executors.newFixedThreadPool(2);
		Buffer sharedLocation = new UnsynchronizedBuffer();
		System.out.println("Action\t\tValue\tProduced\tConsumed");
		System.out.println("------\t\t-----\t--------\t--------\n");
		try{
			application.execute(new Producer(sharedLocation));
			application.execute(new Consumer(sharedLocation));
		} catch(Exception exception){
			exception.printStackTrace();
		}
		application.shutdown();
	}

}
