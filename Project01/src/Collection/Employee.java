package Collection;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	
	private String name;
	private int id;
	private Date hireDate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
	public Employee(String name, int id, String hireDate) {
		super();
		this.name = name;
		this.id = id;
		DateFormat f = new SimpleDateFormat("yyyy-mm");
		try {
			this.hireDate = f.parse(hireDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
