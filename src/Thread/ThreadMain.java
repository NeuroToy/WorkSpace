package Thread;

public class ThreadMain {

	public static void main(String[] args) {

		Thread first = new NewThread(1);
		Thread second = new NewThread(2);
		first.start();
		second.start();
	}
}
