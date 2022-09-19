package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPaper {
	public static void main(String[] args) {
		List<Paper> li = new ArrayList<Paper>();
		li.add(new Paper(15,"其次其次"));
		li.add(new Paper(15,"最后"));
		li.add(new Paper(20,"优先优先优先"));
		Collections.sort(li); //sort方法会调用compareTo
		for(Paper p :li) {
			System.out.println("排序后:"+p.toString());
		}
	}
		
}
