
/**
 *collections:是集合框架的工具类,方法都是静态方法
 */
 
package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {

	
	public static void main(String[] args) {
		//创建集合
		List<String> list=new ArrayList<String>();
		//添加元素
		
		list.add("baidu");
		list.add("shengda");
		list.add("apple");
		list.add("google");
		list.add("alibaba");
		list.add("facebook");
		list.add("java");
		//遍历
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("======================");
		//使用元素的自然排序来排序
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		
		
		List<Person> list2= new ArrayList<>();
		list2.add(new Person(12,"android"));
		list2.add(new Person(1,"java"));
		list2.add(new Person(3,"baidu"));
		list2.add(new Person(4,"alibaba"));
		list2.add(new Person(4,"alibaba"));
		list2.add(new Person(5,"alibaba"));
		list2.add(new Person(6,"alibaba"));
		list2.add(new Person(4,"baidu"));
//		
//		//遍历
//		for (Person person : list2) {
//			System.out.println(person);
//		}
		System.out.println("//////////////////");
		
		Collections.sort(list2, new ComByLengh());
		for (Person person : list2) {
			System.out.println(person);
		}
		Person max= Collections.max(list2, new ComByLengh());
		System.out.println("年龄最大的人是"+max.getName()+"他的年龄是"+max.getAge());
	
	
	
	
	
	}
	

}
