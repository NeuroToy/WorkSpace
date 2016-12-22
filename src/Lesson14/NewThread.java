package Lesson14;

class NewThread extends Thread {
	boolean suspeandFlag;
	int count;
	Thread t;

	public NewThread(int num) {
		super("Thread" + num);
		suspeandFlag = false;
	}

	public void run() {
		System.out.print("\n" + Thread.currentThread().getName() + ": ");
		try {
			for (count = 1; count < 101; count++) {
				System.out.print(count + " ");
				synchronized (this) {
					if (count % 10 == 0) {
						suspeandFlag = true;
						while (suspeandFlag && count != 100) {
							wait();
						}
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void myresume() {
		suspeandFlag = false;
		notify();
	}
}
