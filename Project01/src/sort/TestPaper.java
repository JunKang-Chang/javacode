package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPaper {
	public static void main(String[] args) {
		List<Paper> li = new ArrayList<Paper>();
		li.add(new Paper(15,"������"));
		li.add(new Paper(15,"���"));
		li.add(new Paper(20,"������������"));
		Collections.sort(li); //sort���������compareTo
		for(Paper p :li) {
			System.out.println("�����:"+p.toString());
		}
	}
		
}
