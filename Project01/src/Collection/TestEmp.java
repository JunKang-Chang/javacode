package Collection;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestEmp {
	public static void main(String[] args)  {
		Employee e1 = new Employee("1",0301,"2000-1");
		Employee e2 = new Employee("2",0302,"2000-2");
		Employee e3 = new Employee("3",0303,"2000-3");
		
		List<Employee> L = new ArrayList<Employee>();
		
		L.add(e1);
		L.add(e2);
		L.add(e3);
		printName(L);
		
	}
	public static void printName(List<Employee> L){
		for (int i=0;i<L.size();i++) {
			System.out.println(L.get(i).getName());
		}
	}


}
