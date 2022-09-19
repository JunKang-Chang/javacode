package fanxing;
/**
 * 类型不确定  是类型实参，而不是类型形参
 * 当操作类型时，不需要使用类型的具体功能时，只使用Object类中的功能。那么可以用 ? 通配符来表未知类型。	 			
 * ?->object
 */

import java.util.ArrayList;
import java.util.List;

public class TongPeiFu {
	public static void main(String[] args) {
		List<?> li = new ArrayList<Integer>();
				li = new ArrayList<Object>();
				li = new ArrayList<String>();//重新赋值
		
	}
	
	public static void test(List<?> li) {
		
	}
	
	
	
}
