package Map;

import java.util.ArrayList;
import java.util.List;

public class Demo012 {
	public static void main(String[] args) {
		
	}
	
	public static List<Student> exam(){
		List<Student> li = new ArrayList<Student>();
		li.add(new Student("stu1","A",80));
		li.add(new Student("stu2","A",80));
		li.add(new Student("stu3","B",50));
		li.add(new Student("stu4","B",50));
		li.add(new Student("stu5","B",50));
		return li;
		
		
	}
}
