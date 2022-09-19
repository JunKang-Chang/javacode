package sort;

public class Demo1 {
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		System.out.println(a.compareTo(b));

		//输出值-1
		
		String a1 = "b";
		String b1 = "a";
		System.out.println(a1.compareTo(b1));

		
		String a2 = "a";
		String b2 = "a";
		System.out.println(a2.compareTo(b2));

		//两个字符串首字母不同，则该方法返回首字母的asc码的差值

		String a3 = "abc";
		String b3 = "bcdfg";
		System.out.println(a3.compareTo(b3));

		
		//参与比较的两个字符串如果首字符相同，则比较下一个字符，直到有不同的为止，返回该不同的字符的asc码差值

		String a4 = "abc";
		String b4 = "abedfg";
		System.out.println(a4.compareTo(b4));

		
		//两个字符串不一样长，可以参与比较的字符又完全一样，则返回两个字符串的长度差值

		String a5 = "abc";
		String b5 = "abcdefg";
		System.out.println(a5.compareTo(b5));

		String a6 = "abcde";
		String b6 = "abcd";
		System.out.println(a6.compareTo(b6));

		
	}
}
