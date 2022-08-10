
public class ThreadTest_1 extends Thread {

	public static void main(String[] args) {
		Thread th = new Thread();
		th.start();
		System.out.println("Thread name: " + Thread.currentThread().getName());
	}

	public void run() {
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}

}
