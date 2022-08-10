
class Task extends Thread {
	public void run() {
		System.out.println("Hello All ");
	}
}

public class ThreadTest_2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Thread thread = new Thread(new Task());
			thread.start();
		}

	}

}
