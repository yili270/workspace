package com.test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList c= new LinkedList();
		c.add(new Student("吴林染",99));
		c.add(new Student("黄家新",98));
		c.add(new Student("陈良全",99));
		c.add(new Student("胡辉",100));
		c.add(new Student("倪昌杰",99));
		System.out.println(c);
		
//		Iterator it= c.iterator();
//		while (it.hasNext()) {
//			Object object = (Object) it.next();
//			System.out.println(object);
//		}
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println(c);
		
	}

}