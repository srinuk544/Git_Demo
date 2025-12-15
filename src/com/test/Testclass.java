package com.test;

public class Testclass extends Thread {

	public void run() {
		for (int i = 0; i <= 5; i++) {
			if (i % 2 == 0) {
				System.out.println("even numbers from run method:" + i);

			}

		}
	}

	public static void main(String[] args) {

		Testclass t = new Testclass();
		t.start();
		for (int i = 1; i <= 8; i++) {
			if (i % 2!= 0) {
				System.out.println("odd numbers from Main method:" + i);
			}

		}
	}
}
