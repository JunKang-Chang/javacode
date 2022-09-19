package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 统计单词出现次数
 * @author VULCAN
 *分拣存储 1:n
 */
public class Demo01 {
	public static void main(String[] args) {
		
		
		String[] arr = new String("this is a cat and that is a mice").split(" ");//调用此方法用空格分割字符串
		Map<String ,Integer> m = new HashMap<String,Integer>();//分拣存储
		
		for (String key:arr) {//下标:数组名
			System.out.println(key);
				
		if(!m.containsKey(key)) {//检查是否存在该单词
			m.put(key, 1);
		}
		else {
			m.put(key, m.get(key)+1);
		}
		
		}
		
	
		Set<String> kt = m.keySet();	//遍历    //keyset:获取所有Key值
		Iterator<String> it =kt.iterator();
		while(it.hasNext()) {
			String key =it.next();
			Integer value =m.get(key);
			System.out.println(key+"----"+value);
		}
	
	
	
	
	}
}
