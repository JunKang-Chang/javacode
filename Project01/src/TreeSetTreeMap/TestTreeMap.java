package TreeSetTreeMap;

import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		Person p1 = new Person("ÎÒ",50);
		Person p2 = new Person("Ëü",70);
		Person p3 = new Person("Äã",70);
		Person p4 = new Person("Ëı",60);
		
		TreeMap<Person,String> tm = new TreeMap<Person,String>();
		tm.put(p1, "Test");
		tm.put(p2, "Test");
		tm.put(p3, "Test");
		tm.put(p4, "Test");
		
		Set<Person>  p = tm.keySet();
		System.out.println(p.toString());
		
		
	}
}
