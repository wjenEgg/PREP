package august;

public class Producer implements Runnable {

	Q q;
	Producer(Q q){
		this.q = q;
		new Thread(this,"Producer").start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true){
			try {
				q.put(i++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
