package pers.shaofeng.example.demo_20;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		PrintStream out = System.out;
		Set<Integer> integer = new HashSet<Integer>();
		Set<String> string = new HashSet<String>();

		out.println();
		out.println("integer添加元素前：" + integer);
		out.println("integer.size：" + integer.size());
		out.println("stringr添加元素前：" + string);
		out.println("string.size：" + string.size());
		Boolean boo = integer.isEmpty();
		out.println("integer isEmpty:" +boo);
		out.println("ingeter的哈希码："+integer.hashCode());
		
		integer.add(10);
		integer.add(20);
		integer.add(30);
		integer.add(40);
		integer.add(50);
		integer.add(60);
		out.println("integer添加元素后：" + integer);
		integer.size();
		out.println("integer.size：" + integer.size());

		integer.add(11);
		integer.add(10);
		integer.add(21);
		integer.add(30);
		integer.add(41);
		integer.add(50);
		out.println("integer添加元素后<11>：" + integer);
		integer.size();
		out.println("integer.size：" + integer.size());
		out.println("integer isEmpty:" + integer.isEmpty());
		Boolean bool = integer.contains(10);
		out.println("integer是否包含10："+bool);

		out.println();
		Object[] objects = integer.toArray();
		out.println("integer: " + integer);
		for (Object str : objects) {
			out.println(str);

		}
		out.println();
		Integer[] y = integer.toArray(new Integer[0]);
		out.println("遍历数组y：");
		for (Integer integer2 : y) {
			out.println(integer2);
		}
		out.println();

		List<Integer> intlist = new ArrayList<Integer>();
		out.println("intlist添加元素前:" + intlist);
		out.println("添加元素前intlist.size:" + intlist.size());
		out.println("intlist isEmpty:"+intlist.isEmpty());

		intlist.add(11);
		intlist.add(21);
		intlist.add(41);
		out.println("intlist添加元素后:" + intlist);
		out.println("添加元素后intlist.size:" + intlist.size());
		out.println("intlist isEmpty:"+intlist.isEmpty());
		Boolean boole = intlist.contains(10);
		out.println("integer是否包含15："+boole);
		
		out.println();
		integer.equals(intlist);
		out.println("integer是否与intlist相等："+integer.equals(intlist));
		out.println("ingeter的哈希码："+integer.hashCode());
		out.println("ingeter是否移除100："+integer.remove(100));
		out.println("ingeter是否移除60："+integer.remove(60));
		out.println("integer移除60后：" + integer);

		out.println("integer是否移除intlist中元素："+integer.removeAll(intlist));
		out.println("integer移除intlist后：" + integer);
		
		List<Integer> intlist1 = new ArrayList<Integer>();
		intlist1.add(1);
		intlist1.add(99);
		integer.addAll(intlist1);

		out.println("integer是否添加intlist1中元素："+integer.addAll(intlist1));
		out.println("integer添加intlist后：" + integer);
	}

}
