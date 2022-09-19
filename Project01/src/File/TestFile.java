package File;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
				
		File f = new File("D:/javacode/HelloWorld.java"); //文件
		File f2 = new File("D:/javacode");			//目录
		File f3 = new File(f2,"TestFile666.java");	//创建文件
		
		File f4 = new File("D:/javacode/aa");
		File f5 = new File("D:/javacode/bb/ccc/dddd");//创建目录
		
		if (f.isFile()) {
			System.out.println("是一个文件");
		}
		
		if (f2.isDirectory()) {
			System.out.println("是一个目录");
		}
		
		
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		f3.delete();
					
		f4.mkdir();		//创建单目录
		f5.mkdirs();	// .. 多..
	
	}
	
}
