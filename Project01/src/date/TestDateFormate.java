package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormate {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");		//����ת��	�����಻��ʵ����,ͨ������SDF
		Date d = new Date(2143443L);
		String str = df.format(d);	//format:ʱ��ת�ַ���
		System.out.println(str);
		System.out.println("####################");
		String str2 = ("1990-1-1");
		DateFormat df2 = new SimpleDateFormat("yyyy-mm-dd"); //��ʽһ��
		try {														//�����쳣
			Date d2 =df2.parse(str2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str2);
	}
}
