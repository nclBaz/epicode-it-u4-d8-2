package u4d8.synchronization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	public static Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		Countdown c = new Countdown();
		CountdownThread t1 = new CountdownThread(c);
		CountdownThread t2 = new CountdownThread(c);

		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start();

	}

}
