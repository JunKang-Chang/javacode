package TreeSetTreeMap;

import java.util.TreeSet;

public class TestTreeSet {	//TreeSet��Set��һ�����࣬TreeSet����������Ԫ�ؽ��������,ͬ����Ҳ���Ա�֤Ԫ�صĲ����ظ�
								//���������ʱ��������

	public static void main(String[] args) {
			Person p1 = new Person("��",50);
			Person p2 = new Person("��",70);
			Person p3 = new Person("��",70);
			Person p4 = new Person("��",60);
			
			
			TreeSet<Person> ts = new TreeSet<Person>();
			ts.add(p1);
			ts.add(p2);
			ts.add(p3);
			ts.add(p4);
			
			
			System.out.println(ts.toString());
	}

}
