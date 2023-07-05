package u4d8.threads;

public class SimpleRunnable implements Runnable {

	private String color;

	public SimpleRunnable(String color) {
		this.color = color;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			App.log.info(" --> " + i);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			System.out.println(color + Thread.currentThread().getName() + " --> " + i);
		}
	}

}
