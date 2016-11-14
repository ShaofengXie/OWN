package pers.shaofeng.thread;

class MyRunnable implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 8; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}