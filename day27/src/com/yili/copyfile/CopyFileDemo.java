package com.yili.copyfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		
		//1.创建读取对象和写入对象
		//2.读文件并写入文件
		//3.释放资源
		
		FileReader fr=new FileReader("ReaderDemo.java");
		FileWriter fw=new FileWriter("D:\\java\\ copy.java");
		//读写文件
		int h=0;
		while ((h=fr.read())!=-1) {
			fw.write(h);
		}
		
		
		//释放资源
		fr.close();
		fw.close();
		
		
		
	}

}
