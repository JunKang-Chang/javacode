package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ͳ�Ƶ��ʳ��ִ���
 * @author VULCAN
 *�ּ�洢 1:n
 */
public class Demo01 {
	public static void main(String[] args) {
		
		
		String[] arr = new String("this is a cat and that is a mice").split(" ");//���ô˷����ÿո�ָ��ַ���
		Map<String ,Integer> m = new HashMap<String,Integer>();//�ּ�洢
		
		for (String key:arr) {//�±�:������
			System.out.println(key);
				
		if(!m.containsKey(key)) {//����Ƿ���ڸõ���
			m.put(key, 1);
		}
		else {
			m.put(key, m.get(key)+1);
		}
		
		}
		
	
		Set<String> kt = m.keySet();	//����    //keyset:��ȡ����Keyֵ
		Iterator<String> it =kt.iterator();
		while(it.hasNext()) {
			String key =it.next();
			Integer value =m.get(key);
			System.out.println(key+"----"+value);
		}
	
	
	
	
	}
}
