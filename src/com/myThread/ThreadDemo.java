package com.myThread;
class MyThread extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				total = total + i;
				System.out.println(total);
			}
			notify();
			System.out.println("MyThread Calling Notify");
		}
	}
}

class MyThread1 extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				total = total + i;
				System.out.println(total);
			}
			System.out.println("MyThread1 Calling Notify");
			notifyAll();
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		
		MyThread t2 = new MyThread();
		
		MyThread1 x = new MyThread1();
		t1.start();
		t2.start();
		x.start();
		synchronized (t1) {
			System.out.println("MyThread total is waiting for MyThread completion...");
			try {
				System.out.println("Calling Wait");
				t1.wait();
				System.out.println("Running again");
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
		}
		System.out.println("MyThrad total is =" + t1.total);
	}
};
