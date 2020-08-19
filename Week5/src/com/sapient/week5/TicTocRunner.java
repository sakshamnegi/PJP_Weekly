package com.sapient.week5;

class TicThread extends Thread {
	CustomMutex mutex;

	public TicThread(CustomMutex mutex) {
		this.mutex = mutex;
	}

	public void run() {
		try {
			synchronized (mutex) {
				for (int i = 1; i <= 10; i++) {
					while (mutex.flag != true) {
						mutex.wait();
					}
					System.out.print("tic ");
					mutex.flag = false;
					mutex.notifyAll();
				}

			}
		} catch (Exception e) {
			System.out.println("Exception Tic : " + e.getMessage());
		}
	}
}

class TocThread extends Thread {
	CustomMutex mutex;

	public TocThread(CustomMutex mutex) {
		this.mutex = mutex;
	}

	public void run() {
		try {
			synchronized (mutex) {
				for (int i = 1; i <= 10; i++) {
					while (mutex.flag != false) {
						mutex.wait();
					}
					System.out.print(" toc | ");
					mutex.flag = true;
					mutex.notifyAll();
				}

			}
		} catch (Exception e) {
			System.out.println("Exception Toc : " + e.getMessage());
		}
	}
}

class CustomMutex {
	volatile boolean flag = true;
}

public class TicTocRunner {

	public static void main(String[] args) {

		CustomMutex mutex = new CustomMutex();
		Thread tic = new TicThread(mutex);
		Thread toc = new TocThread(mutex);
		tic.start();
		toc.start();

	}

}
