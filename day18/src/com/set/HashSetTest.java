package com.set;

import java.util.HashSet;
import java.util.Iterator;

import com.text.Person;
/*
 * 把自定义对象添加到hashset
 * */

public class HashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		Person person=new Person(111,"IBM");
		hs.add(person);
		hs.add(new Person(23,"apple"));
		hs.add(new Person(12,"google"));
		System.out.println(hs.add(new Person(12,"google")));
		
		System.out.println(hs.add(new Person(12,"baidu")));
		System.out.println(""+hs+"size="+hs.size());
		
		Iterator it= hs.iterator();
		while (it.hasNext()) {
			Person obj = (Person) it.next();
			System.out.println(obj.getName()+"--"+obj);
		}
	}

}