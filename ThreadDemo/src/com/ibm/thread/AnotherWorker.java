package com.ibm.thread;

public class AnotherWorker implements Runnable {
	@Override
	public void run() {
		System.out.println("In another worker " + Thread.currentThread());

	}
}
