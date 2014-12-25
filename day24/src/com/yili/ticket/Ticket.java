package com.yili.ticket;

public class Ticket implements Runnable{
	private int tickets=100;
	
	public void run() {
		while(true){
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickets--)+"张票");
			}
	}	
		
		
	}
	public static void main(String[] args) {
		Ticket t= new Ticket();
		
		Thread t1=new Thread(t,"窗口1");
		Thread t2=new Thread(t,"窗口2");
		Thread t3=new Thread(t,"窗口3");
		Thread t4=new Thread(t,"窗口4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	

}
