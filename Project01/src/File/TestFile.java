package File;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
				
		File f = new File("D:/javacode/HelloWorld.java"); //�ļ�
		File f2 = new File("D:/javacode");			//Ŀ¼
		File f3 = new File(f2,"TestFile666.java");	//�����ļ�
		
		File f4 = new File("D:/javacode/aa");
		File f5 = new File("D:/javacode/bb/ccc/dddd");//����Ŀ¼
		
		if (f.isFile()) {
			System.out.println("��һ���ļ�");
		}
		
		if (f2.isDirectory()) {
			System.out.println("��һ��Ŀ¼");
		}
		
		
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		f3.delete();
					
		f4.mkdir();		//������Ŀ¼
		f5.mkdirs();	// .. ��..
	
	}
	
}
