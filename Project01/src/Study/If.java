package Study;

public class If {
	public static void main(String[] args) {
		double d =Math.random();
		int e =1+ (int)(d*6);
		System.out.println(e);
		if (e>3) {
			System.out.println("����");
		}
		else {
			System.out.println("С��");
		}
		if (e>=4) {
			System.out.println("�����ܺ�");
		}
		else if (e>=2) {
			System.out.println("����һ��");
		}
		else {
			System.out.println("��������");
		}
	}
}
