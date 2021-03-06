package com.yili.runable;
/*
 * 实现runable接口的方式:
 * 	A:自定义类MyRunable实现Runable接口
 * 	B:重写run()方法
 * 	C:创建自定义类的对象
 * 	D:创建Thread类的对象,把myRunable类的对象作为构造参数传递
 *  E:调用Thread类的start()方法即可
 * */
public class MyRunableDemo {
	public static void main(String[] args) {
		MyRunable my=new MyRunable();
		
//		Thread t1=new Thread(my);
//		Thread t2=new Thread(my);
//		
//		t1.setName("喜洋洋");
//		t2.setName("灰太狼");
		
		//public thread()
		Thread t1= new Thread(my,"喜洋洋");
		Thread t2= new Thread(my,"灰太狼");
		
		t1.start();
		t2.start();
	}
}
