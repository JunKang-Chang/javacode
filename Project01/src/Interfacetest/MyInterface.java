package Interfacetest;

public interface MyInterface {
	//ֻ���������ͳ��󷽷�,����Ĭ�� public final static,����Ĭ��public abstract;
	String  MAX_GRADE="BOSS";
	int  MAX_SPEED=120;
	public  void test01();
	public int test02(int a,int b);//����������;
	
	
		
	
class TestMyInterface implements MyInterface {
		
		public  void test01() {
			System.out.println("Test01");
		}

			
		public int test02(int a, int b) {
			return a+b;
		}
					
	}	
		
}
