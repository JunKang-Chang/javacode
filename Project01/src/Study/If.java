package Study;

public class If {
	public static void main(String[] args) {
		double d =Math.random();
		int e =1+ (int)(d*6);
		System.out.println(e);
		if (e>3) {
			System.out.println("大数");
		}
		else {
			System.out.println("小数");
		}
		if (e>=4) {
			System.out.println("运气很好");
		}
		else if (e>=2) {
			System.out.println("运气一般");
		}
		else {
			System.out.println("运气不好");
		}
	}
}
