package Thread;

public class ThreadMain {

	public static void main(String[] args) {

		NewThread first = new NewThread(1);
		NewThread second = new NewThread(2);

		try {
			first.start();
			Thread.sleep(200);
			second.start();
			while (first.count < 100) {
				Thread.sleep(200);
				System.out.print("\n" + first.getName() + ": ");
				Thread.sleep(200);
				first.myresume();
				Thread.sleep(200);
				System.out.print("\n" + second.getName() + ": ");
				Thread.sleep(200);
				second.myresume();
			}
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\nExit.");
	}
}
