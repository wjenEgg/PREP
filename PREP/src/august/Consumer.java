package august;

public class Consumer implements Runnable {

	Q q;
	Consumer(Q q){
		this.q = q;
		new Thread(this,"Consumer").start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				q.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
