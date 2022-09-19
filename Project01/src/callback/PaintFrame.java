package callback;

public  class PaintFrame {
	public static void drawFrame(Myframe f) {
		 	System.out.println("启动线程");
		 	System.out.println("循环,查看消息栈");
		 	
		 	//画窗口
		 	f.paint();
		 	
		 	
		 	System.out.println("启动缓存增加效率");
	}
	public static void main(String[] args) {
		drawFrame(new GameFrame01());
	}
}
	
class GameFrame01 extends Myframe{
	public void paint() {
		System.out.println("GameFrame01.paint()");
		System.out.println("画窗口");
	}
}


