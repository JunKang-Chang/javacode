package File;

 public class MyException  extends Exception {
	public MyException(String message) {
		super(message);		//���ø��๹�췽��
	}
}

	class TestMyException{
	public	void test() throws MyException{	
		}
	
	
	public static void main(String[] args) {
		try {
			new TestMyException().test();
						
		}catch (MyException e) {
			e.printStackTrace();
		}
	
	}
	}
	