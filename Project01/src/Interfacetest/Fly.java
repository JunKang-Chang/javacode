package Interfacetest;

public interface Fly {
	int MAX_SPEED=100;
	int HIGH=1;
	
	public void canfly();
	
}

 interface Attack{
	public void attack();
}


class Plane implements Fly{
	public void canfly() {
		System.out.println("�ɻ������������ڷ�");
	}
}

class Human implements Fly{
	public void canfly() {
		System.out.println("������");
	}
}

class Stone implements Fly,Attack{       //ʵ�ֶ���ӿ�,�ӿ��еĳ��󷽷����뱻ʵ��;
	public void canfly() {
		System.out.println("�ӳ�ȥ");
	}
	
	public void attack() {
		System.out.println("��ʯͷ����");
	}
}