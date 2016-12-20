package Thread;

class NewThread extends Thread {
	boolean suspeandFlag;
	int count;

	public NewThread(int num) {
		super("Thread" + num + ": ");
	}

	public void run() {
		System.out.print("Thread: ");
		try {
			for (count = 1; count < 101; count++) {
				System.out.print(count);

				while (suspeandFlag) {
					wait();
				}

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void mysuspend() {
		if (count % 10 == 0) {
			suspeandFlag = true;
		}
	}

	synchronized void myresume() {
		suspeandFlag = false;
		notify();
	}
}
