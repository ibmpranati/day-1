package com.ibm.thread;

public class WorkerThread extends Thread {
	@Override
	public void run() {
		System.out.println("In Worker Thread " + currentThread());
		super.run();
	}

}
