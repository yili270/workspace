package com.text;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		
		for (int i = 0; i < 5; i++) {
			v.addElement("it-"+i);
		}
		System.out.println(v);
		
		Enumeration en = v.elements(); 
		
//		while (en.hasMoreElements()) {
//			Object object = (Object) en.nextElement();
//			System.out.println(en.nextElement());
//		}
		
		for ( en = v.elements(); en.hasMoreElements();)
		       System.out.println(en.nextElement());
		
		
	}

}
