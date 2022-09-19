package TreeSetTreeMap;

import java.util.TreeSet;

public class TestTreeSet {	//TreeSet是Set的一个子类，TreeSet是用来对象元素进行排序的,同样它也可以保证元素的不可重复
								//在添加数据时进行排序

	public static void main(String[] args) {
			Person p1 = new Person("我",50);
			Person p2 = new Person("它",70);
			Person p3 = new Person("你",70);
			Person p4 = new Person("她",60);
			
			
			TreeSet<Person> ts = new TreeSet<Person>();
			ts.add(p1);
			ts.add(p2);
			ts.add(p3);
			ts.add(p4);
			
			
			System.out.println(ts.toString());
	}

}
