package Map;

import java.util.HashSet;
import java.util.Set;

//���򲻿��ظ�
public class Testset {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("aaa");
		s.add(new String("aaa"));//�ظ�
		System.out.println(s.size());
		System.out.println(s.contains("aaa"));
		//s.remove("aaa");
		
	}
}
