package Study;
class Country {
    String name;
    public void value() {
       name = "China";
    }
}
  
class City extends Country {
    String name;
    public void value() {
    name = "Shanghai";
    super.value();      //调用父类的方法
    System.out.println(name);
    System.out.println(super.name);
    }
}

public class TestThisandSuper{
	public static void main(String[] args) {
	       City c=new City();
	       c.value();
	       }
}
    
