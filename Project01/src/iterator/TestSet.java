package iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("111");
		s.add("222");
		s.add("333");
		
		Iterator i =s.iterator();//����
		while(i.hasNext()){//����
			System.out.println(i.next());
	}
}
}