package array;

public class One {
	public static void main(String[] args) {
		int[] a = new int[2];
		a[0] = 23;
		a[1]= 17;
		Car[] cars = new Car[2];
		cars[0] = new Car("����");
		cars[1] = new Car("����");
		System.out.println(a[0]+","+a[1]);
		System.out.println(cars[0].name+","+cars[1].name);
		
	}
}
