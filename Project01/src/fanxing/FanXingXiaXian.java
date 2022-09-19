package fanxing;
//自身 >=
import java.util.ArrayList;
import java.util.List;

public class FanXingXiaXian {
	public static void main(String[] args) {
		List<Apple> li1 = new ArrayList<Apple>();
		List<Fruit> li2 = new ArrayList<Fruit>();
		List<Object> li3 = new ArrayList<Object>();
		
		
		List<? super Fruit> list4 = new ArrayList<Object>();
		
		
		
	}
	public static void test(List<? super Apple> li) {	//	无法添加父类对象
		li.add(new Apple());
		li.add(new FuJiApple());
	}
	
	
}
