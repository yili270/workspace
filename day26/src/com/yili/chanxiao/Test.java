package com.yili.chanxiao;

class Resource{
	int id;
	String name;
	boolean flag = false;//是否有产品
	
}

//产线
class Input implements Runnable{
	
	Resource r;
	int  key =0;
	public Input(Resource r) {
		super();
		this.r = r;
	}

	public void run(){
		
		
		while (true) {
			
			synchronized (r) {
				if (r.flag) {//停产,休息
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	
			
			switch (key++%3) {
			case 0:
				r.id=666; r.name="iphone6";
				System.out.println("生产iPhone6");
				break;
			case 1:
				r.id=777; r.name="iphone7";	
				System.out.println("生产iPhone7");
				break;
			case 2:
				r.id=888; r.name="iphone8";
				System.out.println("生产iPhone8");
				break;

			default:
				break;
			}
			r.flag=true;
			r.notify();
			}
		}
	}
}
/*
 *
 * 
 */
class Output implements Runnable{
	Resource r;	
	
	public Output(Resource r) {
		super();
		this.r = r;
	}

	public void  run() {
		//1.产品
		
		while (true) {	
			synchronized (r) {
				if (!r.flag) {//没产品
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		
			System.out.println("卖:"+r.name+"\t id:"+r.id);
			r.flag=false;
			r.notify();
			}
			
		}
	}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建共享资源
		Resource r=new Resource();
		//创建线程任务 run
		Input  input  = new Input(r);
		Output output = new Output(r);
		//创建线程对象
		 
		Thread in=new Thread(input);
		Thread out=new Thread(output);
		//开始工作
		in.start();
		out.start();
		
		

	}

}
