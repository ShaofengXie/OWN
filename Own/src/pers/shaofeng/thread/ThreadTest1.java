package pers.shaofeng.thread;

public class ThreadTest1 {

    public static void main(String[] args) {
        for (int i = 0; i < 40; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
            	/**
            	 * thread1和thread2调用的是MyRunable的方法
            	 */
                Runnable myRunnable = new MyRunnable(); // 创建一个Runnable实现类的对象
                Thread thread1 = new Thread(myRunnable); // 将myRunnable作为Thread target创建新的线程
                Thread thread2 = new Thread(myRunnable);
                thread1.start(); // 调用start()方法使得线程进入就绪状态
                thread2.start();
            }
        }
    }
}