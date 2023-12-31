package u4d8.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	public static Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		log.info("CIAO");
		SimpleThread t1 = new SimpleThread(Colors.ANSI_CYAN);
		t1.setName("THREAD 1");
		SimpleThread t2 = new SimpleThread(Colors.ANSI_RED);
		t2.setName("THREAD 2");
		t1.start();


		try {
			t1.join();
			t2.start();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// SimpleThread eredita da Thread quindi posso fare direttamente t1.start()
//		t1.run(); // NON CHIAMARE RUN DIRETTAMENTE

		SimpleRunnable r1 = new SimpleRunnable(Colors.ANSI_BLUE);
		SimpleRunnable r2 = new SimpleRunnable(Colors.ANSI_GREEN);

		Thread t3 = new Thread(r1);
		// SimpleRunnable NON eredita da Thread (estende invece l'interfaccia Runnable)
		// Quindi NON posso fare direttamente r1.start(), bensì devo invece
		// crearmi un oggetto di tipo Thread che prenda come parametro r1
		t3.setName("THREAD 3");
		Thread t4 = new Thread(r2);
		t4.setName("THREAD 4");
		t3.start();
		t4.start();

	}
}
