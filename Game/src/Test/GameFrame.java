package Test;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



/**
 * 游戏窗口类
 * @author VULCAN
 *
 */
public class GameFrame	extends Frame {
	public void lunchganme(){
		setSize(500,500);	//调用方法
		setLocation(100,100);
		setVisible(true);
	addWindowListener(new WindowAdapter() {		//匿名内部类

		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	
	});	
	}
	

	public void paint(Graphics g) {
		g.drawLine(100, 100, 150, 150);
		g.setColor(Color.red);
		g.fillOval(300, 300, 20, 20);
	}

public static void main(String[] args) {
	GameFrame gf = new GameFrame();
	gf.lunchganme();
		
}

}
