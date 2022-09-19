package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormate {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");		//向上转型	抽象类不能实例化,通过子类SDF
		Date d = new Date(2143443L);
		String str = df.format(d);	//format:时间转字符串
		System.out.println(str);
		System.out.println("####################");
		String str2 = ("1990-1-1");
		DateFormat df2 = new SimpleDateFormat("yyyy-mm-dd"); //格式一致
		try {														//捕获异常
			Date d2 =df2.parse(str2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str2);
	}
}
