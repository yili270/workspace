package com.text;

import java.util.ArrayList;

public class ArrayList2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		for (int i = 0; i < 5; i++) {
			al.add(new Person(i+10,"it-"+i));
		}
		Person p =new Person(13,"it-3");
		al.add(p);
		System.out.println(al);
		System.out.println(new Person(13,"it-3")+" =="+al.lastIndexOf(p));
		System.out.println(al.indexOf(p)+"==="+al.lastIndexOf(p));
	}

}
