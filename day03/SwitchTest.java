import java.util.*;
public class SwitchTest{
	public static void main(String args[]){
	System.out.println("����ϲ��������");
	Scanner in=new Scanner(System.in);
	String car=in.nextLine();//��ȡ�ĵ��� nextInt()  nextLine()
	switch(car){
	case"Benz":
		System.out.println("Benz");
		break;
	case "Tesla":
		System.out.println("Tesla");
		break;
	default :
		System.out.println("other car");
		break;
	}
	
	in.close();
	}
}