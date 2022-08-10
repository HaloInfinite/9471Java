import java.util.concurrent.*;

class Activity implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

	}
}

public class ThreadTest_4 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		executor.execute(new Activity());
		executor.shutdown();
	}
}
