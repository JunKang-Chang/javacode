package fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型上限 extends
 * @author VULCAN
 *自身>=
 */


public class TongPeiFu2 {
	
	
	public static void main(String[] args) {
		Test t1 = new Test<Fruit>();
		Test t2 = new Test<Apple>();
		Test t3 = new Test<Pear>();
		Test t4 = new Test<FuJiApple>();
		
	}
	
	
	static	class Test<T extends Fruit> {
	}
	

	
	
	List<? extends Fruit> li1 = new ArrayList<Fruit>();
	List<? extends Apple> li4 = new ArrayList<FuJiApple>();
	List<Fruit> li2 = new ArrayList<Fruit>();
	List<Apple> li3 = new ArrayList<Apple>();
	
	
	
	public static void Demo(List <? extends Fruit> li) {
		//li.add(new Fruit());
		//li.add(new FuJiApple());报错	为了保持兼容一致性
		li.add(null);
	}



}
