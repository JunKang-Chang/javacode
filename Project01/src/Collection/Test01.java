package Collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//������ظ�
public class Test01 {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(new Date());
		al.add(123);
		al.add(new Animal());
		al.add("qaz");
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.remove("qaz");
		System.out.println(al.size());
		
		
		List al_2 = new ArrayList();
		al_2.add("qwe");
		al_2.add("rty");
		
		
		al.addAll(al_2);//al_2ֻ��al������һ������,��Ҫ������ж���Ҫ��addAll
		System.out.println(al.size());
		
		String str1 = (String)al.get(4);
		System.out.println(str1);
	}


}

	class Animal{
		
	}