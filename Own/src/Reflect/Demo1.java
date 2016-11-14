package Reflect;

class Test1{
	
}
public class Demo1 {

	public static void main(String[] args) {

		Test1 demo= new Test1();
		System.out.println(demo.getClass().getName());
		
		Class<?> demo1= new Test1().getClass();
		System.out.println(demo1.getName());
		
		Class<?> demo2=Test1.class;
		System.out.println(demo2.getName());
		
		Class<?> demo3=null;
		try {
			
			demo3 = Class.forName("Reflect.Test1");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println(demo3.getName());
	}


}
