package pers.shaofeng.thread;

public class ThreadYieldTest {


	    public static void main(String[] args) {
	        Thread myThread1 = new MyThread6();
	        Thread myThread2 = new MyThread7();
	        myThread1.setPriority(Thread.MAX_PRIORITY);
	        myThread2.setPriority(Thread.MIN_PRIORITY);
	        for (int i = 0; i < 30; i++) {
	            System.out.println("main thread i = " + i);
	            if (i == 20) {
	                myThread1.start();
	                myThread2.start();
	                Thread.yield();
	            }
	        }
	    }

	}

	class MyThread6 extends Thread {

	    public void run() {
	        for (int i = 0; i < 10; i++) {
	            System.out.println("myThread 1 --  i = " + i);
	        }
	    }
	}

	class MyThread7 extends Thread {

	    public void run() {
	        for (int i = 0; i < 10; i++) {
	            System.out.println("myThread 2 --  i = " + i);
	        }
	    }
	}