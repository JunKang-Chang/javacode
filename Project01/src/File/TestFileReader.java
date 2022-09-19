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
		} catch (FileNotFoundException e) {				//�����ǰ����,˳���ܷŷ�
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  catch(IOException e) {
			e.printStackTrace();
		}
		finally {										//finally�����Ƿ��쳣����ִ��,һ��������β����
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
