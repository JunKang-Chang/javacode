package Map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("����", new Wife("����"));
	
		Wife w = (Wife) m.get("����");
		System.out.println(w.name);
		m.containsKey("����");
		m.containsValue("����");
		System.out.println(m.hashCode());
		
	
	}
}

	class Wife{
		String name;
		public Wife(String name) {
			this.name = name;
		}
	}