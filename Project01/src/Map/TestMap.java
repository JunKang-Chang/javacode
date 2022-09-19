package Map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("张三", new Wife("李四"));
	
		Wife w = (Wife) m.get("张三");
		System.out.println(w.name);
		m.containsKey("张三");
		m.containsValue("李四");
		System.out.println(m.hashCode());
		
	
	}
}

	class Wife{
		String name;
		public Wife(String name) {
			this.name = name;
		}
	}