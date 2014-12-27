package com.yili.IOReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		//1.创建字符流输入对象
		//2.读取字符,并显示在控制台
		//3.释放资源
		
		FileReader fr=new FileReader("file.txt");
		
//		int h=fr.read();
//		System.out.println(h);
//		System.out.println((char) h);
		
	
		
		int h = 0;
		while ((h=fr.read())!=-1) {
			System.out.print((char)h);
		}
		fr.close();

	}

}
