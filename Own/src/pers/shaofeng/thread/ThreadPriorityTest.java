package pers.shaofeng.thread;

public class ThreadPriorityTest {


	    public static void main(String[] args) {
	        Thread myThread = new MyThread5();
	        for (int i = 0; i < 8; i++) {
	            System.out.println("main thread i = " + i);
	            if (i==4) {
	            	/**
	            	 * 具有较高线程优先级的线程对象仅表示此线程具有较多的执行机会，而非优先执行
	            	 */
	                myThread.setPriority(Thread.MAX_PRIORITY);
	                myThread.start();
	            }
	        }
	    }

	}

	class MyThread5 extends Thread {

	    public void run() {
	        for (int i = 0; i < 10; i++) {
	            System.out.println("i = " + i);
	        }
	    }
	}
