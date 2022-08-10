class Work implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello India ");

	}

}

public class ThreadTest_3 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Runnable r = new Work();
			Thread thread = new Thread(r);	// Thread thread = new Thread(new Work());
			thread.start();
		}

	}
}
