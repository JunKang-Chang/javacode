package Interfacetest;

public interface InterfaceA {
	public void aaa();
}

interface InterfaceB{
	public void bbb();
}

interface 	InterfaceC extends InterfaceA,InterfaceB{
	public void ccc();
}

class Test implements InterfaceC{			//�ӿڶ�̳�ʵ��
	public  void aaa() {
		System.out.println("a");
	}
	public void bbb() {
		System.out.println("b");
}
	public void ccc() {
		System.out.println("c");
}
}