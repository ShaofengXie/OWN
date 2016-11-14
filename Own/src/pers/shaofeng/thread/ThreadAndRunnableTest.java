package pers.shaofeng.thread;

public class ThreadAndRunnableTest{

    public static void main(String[] args) {
        for (int i = 0; i < 40; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                Runnable myRunnable = new MyRunnable1();
                //Thread thr = new Thread(myRunnable);
                Thread thread = new MyThread1(myRunnable);
                //thr.start();
                thread.start();
                
            }
        }
    }
}

class MyRunnable1 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        System.out.println("in MyRunnable1 run");
        for (i = 0; i < 8; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread1 extends Thread {

    private int i = 0;
    
    public MyThread1(Runnable runnable){
        super(runnable);
    }

    @Override
    public void run() {
        System.out.println("in MyThread run");
        for (i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}