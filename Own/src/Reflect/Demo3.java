package Reflect;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class Person {

	private String name;
	private int age;

	@Override
	public String toString() {

		return "[" + this.name + "  " + this.age + "]";
	}

}

public class Demo3 {

	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("Reflect.Person");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		Person per = null;
		try {
			per = (Person) demo.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		per.setName("zhulijun");
		per.setAge(23);
		System.out.println(per.getName());
		System.out.println(per.getAge());
		System.out.println(per.toString());
		System.out.println(per);
		
	}
}
