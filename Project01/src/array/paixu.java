package array;
import java.util.Arrays;
public class paixu {
	public static void main(String[] args) {
		int[] a = {4,2,65,21,3};
		Arrays.sort(a);//����
							
		System.out.println(Arrays.toString(a));//����,���ַ�����ʽ��ʾ
		for (int i : a) {
			System.out.println(i);				//��������һ�ַ�ʽ
		}
		System.out.println(Arrays.binarySearch(a,65));	//���ֲ���,�ɹ�����λ��,ʧ�ܷ���-1
	}
}
