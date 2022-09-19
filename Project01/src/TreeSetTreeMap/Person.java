package TreeSetTreeMap;

public class Person  implements java.lang.Comparable<Person>  {
	private String name;
	private int point;
	
	
	
	
	public Person() {
		
	}
	
	public Person(String name, int point) {
		super();
		this.name = name;
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public int compareTo(Person o) {//����,���ȱȽϵ÷�
       int result = (this.point - o.point);
       if (result ==0) {
    	   result = this.name.compareTo(o.name);
       }
	
       return result;
	}
	public String toString() {
		return "����:"+name+"����:"+point+"\n";
		
	}
}
