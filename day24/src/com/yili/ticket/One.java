package com.yili.ticket;

public class One extends Thread {
	private static int ticket=100;
	static int num =0;
	
	public void  run() {
		for (int i = 0; i <=100; i++) {
			if (ticket>0) {
				ticket--;
				num++;
				System.out.println(getName()+"卖出了第"+num+"张票,还剩"+ticket+"张票");
				
			}
		}
	}
	

	public static void main(String[] args) {

		One o1=new One();
		One o2=new One();
		One o3=new One();
		
		o1.setName("第一个售票窗口");
		o2.setName("第二个售票窗口");
		o3.setName("第三个售票窗口");
		
		o1.start();
		o2.start();
		o3.start();
		
		
	}

}
