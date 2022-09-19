package Interfacetest;

public interface MyInterface {
	//只包含常量和抽象方法,常量默认 public final static,方法默认public abstract;
	String  MAX_GRADE="BOSS";
	int  MAX_SPEED=120;
	public  void test01();
	public int test02(int a,int b);//不含方法体;
	
	
		
	
class TestMyInterface implements MyInterface {
		
		public  void test01() {
			System.out.println("Test01");
		}

			
		public int test02(int a, int b) {
			return a+b;
		}
					
	}	
		
}
