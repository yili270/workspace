package com.yili.IOWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOwrite {

	public static void main(String[] args) throws IOException {
		
		//1.创建对象
		//2.调用对象并刷新
		//3.关闭
		FileWriter fw =new FileWriter("file.txt",true);
		//FileWriter fw2=new FileWriter("file2.txt")
		for (int i = 0; i < 10; i++) {
			fw.write("java"+i);
			fw.write("\r\n");
		}
		
		//fw.write('a');
		//char[] a ={ 'n','h','中'};
		//fw.write(a);
		
		//fw.write(a,0,2);
		fw.flush();
		fw.close();
		
	}

}
