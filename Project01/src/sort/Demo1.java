package sort;

public class Demo1 {
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		System.out.println(a.compareTo(b));

		//���ֵ-1
		
		String a1 = "b";
		String b1 = "a";
		System.out.println(a1.compareTo(b1));

		
		String a2 = "a";
		String b2 = "a";
		System.out.println(a2.compareTo(b2));

		//�����ַ�������ĸ��ͬ����÷�����������ĸ��asc��Ĳ�ֵ

		String a3 = "abc";
		String b3 = "bcdfg";
		System.out.println(a3.compareTo(b3));

		
		//����Ƚϵ������ַ���������ַ���ͬ����Ƚ���һ���ַ���ֱ���в�ͬ��Ϊֹ�����ظò�ͬ���ַ���asc���ֵ

		String a4 = "abc";
		String b4 = "abedfg";
		System.out.println(a4.compareTo(b4));

		
		//�����ַ�����һ���������Բ���Ƚϵ��ַ�����ȫһ�����򷵻������ַ����ĳ��Ȳ�ֵ

		String a5 = "abc";
		String b5 = "abcdefg";
		System.out.println(a5.compareTo(b5));

		String a6 = "abcde";
		String b6 = "abcd";
		System.out.println(a6.compareTo(b6));

		
	}
}
