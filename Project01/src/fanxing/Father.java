package fanxing;
/**
 * 
 ����=��������	  ֻ������������		
 �Զ��巺�Ϳ��ܰ�����������,��ʵ����ʱҪ�滻�ɾ�������
 */
public abstract class Father<T1,T2> {
	T1 age;
	public abstract void test(T2 name);
}



//����

class C1<T1,T2> extends Father<T1,T2>{			//����ȫ�������Զ��巺��
	@Override
	public void test(T2 name) {
		//this.age-->T1
	}
	
}	

class C2<T2> extends Father<Integer,T2>{		//���ಿ�ֱ����Զ��巺��
	@Override
	public void test(T2 name) {
		//this.age-->Integer
	}}





//������

class C3 extends Father<Integer,String>{		//��������
	@Override
	public void test(String name) {
	//	this.age-->Integer
	}}

class C4 extends Father{					//������,����
	@Override
	public void test(Object name) {
		//this.age-->Object
	}}
