import java.util.Objects;
public class ObjectsTest{
	//定义一个Obj变量 他的默认值是null
	static ObjectsTest obj;
	public static void main(String[] args){
		//输出一个null对象的hashCode值 输出0
		System.out.println(Objects.hashCode(obj));
	    //输出一个null对象的toString值 输出null
		System.out.println(Objects.toString(obj));
		//要求obj不能为null 如果obj为null 则引发异常
		System.out.println(Objects.requireNonNull(obj,"obj参数不能是null!"));
	}
}