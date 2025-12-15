package com.test;

public class Testclass extends Thread {

	public void run() {
		for (int i = 0; i <= 5; i++) {
			if (i % 2 == 0) {
				try {
					Thread.sleep(2500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("even numbers from run method:" + i);

			}

		}
	}

	public static void main(String[] args) throws InterruptedException {

		Testclass t = new Testclass();
		t.start();

		for (int i = 1; i <= 8; i++) {
			if (i % 2 != 0) {
				Thread.sleep(1000);
				System.out.println("odd numbers from Main method:" + i);
			}

		}
	}
}
