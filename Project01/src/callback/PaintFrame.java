package callback;

public  class PaintFrame {
	public static void drawFrame(Myframe f) {
		 	System.out.println("�����߳�");
		 	System.out.println("ѭ��,�鿴��Ϣջ");
		 	
		 	//������
		 	f.paint();
		 	
		 	
		 	System.out.println("������������Ч��");
	}
	public static void main(String[] args) {
		drawFrame(new GameFrame01());
	}
}
	
class GameFrame01 extends Myframe{
	public void paint() {
		System.out.println("GameFrame01.paint()");
		System.out.println("������");
	}
}


