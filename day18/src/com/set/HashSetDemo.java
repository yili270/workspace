package com.set;

import java.util.HashSet;

class A{
	public boolean equals(Object obj) {
		return true;
	}
}

class B{
	public int hashCode() {
		return 1;
	}
	
}
class C{
	public int hashCode() {
		return 2;
	}
	public boolean  equals(Object obj) {
		return true;
	}
	
}

public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashSet books =new HashSet();
		//复写equals方法,返回ture 由于hashcode不一样,因此依然当做两个对象
		System.out.println(books.add(new A()));
		System.out.println(""+books.add(new A())+books.size());
		///两个对象的hashcode一样但是equals不一样 所以也可以成功添加
		System.out.println(books.add(new B()));
		System.out.println(""+books.add(new B())+books.size());
		//equals是ture   hashcode值相同  hashset认为是同一种元素
		System.out.println(books.add(new C()));
		System.out.println(""+books.add(new C())+books.size());
		
		System.out.println(books.add(null));
		System.out.println(books.add(null)); //只能有一个
		
	}

}
