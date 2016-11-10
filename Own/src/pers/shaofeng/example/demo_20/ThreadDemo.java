package pers.shaofeng.example.demo_20;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		Thread thread= Thread.currentThread();
		System.out.println("thread.isDaemon:"+thread.isDaemon());
		System.out.println("thread.isAlive:"+thread.isAlive());
		System.out.println("thread.getId():"+thread.getId());
		System.out.println("thread..getName:"+thread.getName());
		System.out.println("thread.hashCode:"+thread.hashCode());
		System.out.println("thread.getPriority():"+thread.getPriority());
		System.out.println("Thread.activeCount():"+Thread.activeCount());
		System.out.println("Thread.MAX_PRIORITY:"+Thread.MAX_PRIORITY);
		System.out.println("Thread.MIN_PRIORITY:"+Thread.MIN_PRIORITY);
		System.out.println("Thread.NORM_PRIORITY:"+Thread.NORM_PRIORITY);
		System.out.println("thread.isInterrupted():"+thread.isInterrupted());
		System.out.println("进入休眠5秒");
		System.out.println(System.currentTimeMillis());
		Thread.sleep(5000);
		System.out.println(System.currentTimeMillis());
		System.out.println("休眠结束");
		
	}

}
