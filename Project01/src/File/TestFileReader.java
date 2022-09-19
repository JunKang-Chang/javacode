package File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
	public static void main(String[] args)  {
		
		FileReader reader = null;
		try {
			 reader = new FileReader("D:/javacode/tfr.txt");
			char c =(char)reader.read();
			System.out.println(c);
		} catch (FileNotFoundException e) {				//子类放前处理,顺序不能放反
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  catch(IOException e) {
			e.printStackTrace();
		}
		finally {										//finally无论是否异常都会执行,一般用于收尾处理
			try {
				if (reader!=null) {
				reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
	
	}
}
