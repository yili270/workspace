/*
	接口的多继承:继承接口+新增特有的常量
	接口+继承接口 + 完成实现类+实例化
*/
public interface USBWifi extends USB,Wifi{
	String brand = "360";
	void usb2wifi();
}