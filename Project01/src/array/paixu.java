package array;
import java.util.Arrays;
public class paixu {
	public static void main(String[] args) {
		int[] a = {4,2,65,21,3};
		Arrays.sort(a);//排序
							
		System.out.println(Arrays.toString(a));//遍历,以字符串形式表示
		for (int i : a) {
			System.out.println(i);				//遍历的另一种方式
		}
		System.out.println(Arrays.binarySearch(a,65));	//二分查找,成功返回位置,失败返回-1
	}
}
