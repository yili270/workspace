package com.yili.priority;

class demo extends Thread{
	String  name;
	public demo(){}
	public demo(String name) {
		super();
		this.name = name;
		this.setName(name);
	}
	public void run() {
		super.run();
		System.out.println(getName()+"pri="+getPriority());
	}
	
}

public class PriorityDemo {

	public static void main(String[] args) {
		
		demo d1=new demo("孙悟空");
		demo d2=new demo("二郎神");
		demo d3=new demo("玉皇大帝");
		
		d1.setPriority(demo.MAX_PRIORITY);
		d3.setPriority(1);
		d1.start();
		d2.start();
		d3.start();
	}

}
