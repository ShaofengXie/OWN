package pers.shaofeng.thread;

public class ThreadsetDaemonTest {

    public static void main(String[] args) {

        MyRunnable4 myRunnable = new MyRunnable4();
        Thread thread = new Thread(myRunnable);

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 40) {
                thread.start();
                try {
                    Thread.sleep(1);   // 使得thread必然能够马上得以执行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyRunnable4 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
