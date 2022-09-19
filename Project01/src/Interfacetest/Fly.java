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
		System.out.println("飞机依靠发动机在飞");
	}
}

class Human implements Fly{
	public void canfly() {
		System.out.println("跳起来");
	}
}

class Stone implements Fly,Attack{       //实现多个接口,接口中的抽象方法必须被实现;
	public void canfly() {
		System.out.println("扔出去");
	}
	
	public void attack() {
		System.out.println("用石头攻击");
	}
}