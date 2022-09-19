package Map;

import java.util.HashSet;
import java.util.Set;

//无序不可重复
public class Testset {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("aaa");
		s.add(new String("aaa"));//重复
		System.out.println(s.size());
		System.out.println(s.contains("aaa"));
		//s.remove("aaa");
		
	}
}
