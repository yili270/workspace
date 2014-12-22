package com.listtest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class ListTest {

	public static void main(String[] args) {
		
		//Comparator<Student> t =new  MyCompator ();
		//ArrayList<Student> c =new ArrayList<Student>(t); //error
		TreeSet<Student> c=new TreeSet<>(new  MyCompator ());
		
		
		c.add(new Student("吴林染",99));
		c.add(new Student("黄家新",98));
		c.add(new Student("吴良全",99));
		c.add(new Student("胡辉",100));

		
//		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
//			Object object = (Object) iterator.next();
//			System.out.println(object);
//		}
		for (Student student : c) {
			System.out.println(student);
		}
		
	}

}
