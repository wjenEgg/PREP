package multithread;

import java.awt.Color;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class RunnableObject implements Runnable {
	private static Random generator = new Random();
	private Lock lockObject;
	private Condition suspend;
	private boolean suspended = false;
	private JLabel output;
	public RunnableObject (Lock theLock, JLabel label){
		lockObject = theLock;
		suspend = lockObject.newCondition();
		output = label;
	}
	public void run(){
		final String threadName = Thread.currentThread().getName();
		while(true){
			try{
				Thread.sleep(generator.nextInt(1000));
				lockObject.lock();
				try{
					while(suspended){
						suspend.await();
					}
				} finally{
					lockObject.unlock();
				}
			} catch(InterruptedException exception){
				exception.printStackTrace();
			}
			SwingUtilities.invokeLater(
					new Runnable(){
						public void run(){
							char displayChar = (char) (generator.nextInt(26)+65);
							output.setText(threadName+": "+displayChar);
						}
					}
					);
		}
	}
	public void toggle(){
		suspended = !suspended;
		output.setBackground(suspended ? Color.RED : Color.GREEN);
		lockObject.lock();
		try{
			if(!suspended){
				suspend.signal();
			}
		} finally {
			lockObject.unlock();
		}
	}
}
