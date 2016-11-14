package Reflect;

/**
 * 反射机制 得到一个类的三种方法演示
 * 
 */
class Test2 {

}

/**
 * 主方法
 *
 */
public class Demo2 {

	public static void main(String[] args) {

		Class<?> test = null;
		Class<?> test1 = null;
		Class<?> test2 = null;
		try {
			// 尽量使用此种方法
			test = Class.forName("Reflect.Test2");// 得到一个类的第一种方法
		} catch (Exception e) {
			e.printStackTrace();
		}
		test1 = Test2.class; // 得到一个类的第二种方法
		test2 = new Test2().getClass(); // 得到一个类的第三种方法
		System.out.println("类名称：" + test.getName());
		System.out.println("类名称：" + test1.getName());
		System.out.println("类名称：" + test2.getName());
	}

}
