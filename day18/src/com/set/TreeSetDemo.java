package com.set;

import java.util.Iterator;
import java.util.TreeSet;

import com.text.Person;

/*
 * 让普通类具有可比性,实现comparto
 * */

public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		 ts.add(new Person(12, "google"));
		 ts.add(new Person(1,"yili"));
		 ts.add(new Person(6,"baidu"));
		 ts.add(new Person(7,"alibaba"));
		 ts.add(new Person(6,"tencent"));
		 ts.add(new Person(6,"sogou"));
		 ts.add(new Person(3,"sogou"));
		 ts.add(new Person(8,"sogou"));
		
		for (Iterator iterator = ts.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println(ts.first());

	}

}
