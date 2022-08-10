
public class ThreadDemo {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Currently Running Child Thread: " + threadName);
		};
		Thread th = new Thread(runnable);
		th.start();

		String threadName = Thread.currentThread().getName();
		System.out.println("Currently Running " + threadName);
	}

}
