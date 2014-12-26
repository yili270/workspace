package com.yili.gongxiang;

class Resource{
	int id;
	String name;
	
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
		while (true) {	
		synchronized (r) {
			
		
			System.out.println("卖:"+r.name+"\t id:"+r.id);
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
