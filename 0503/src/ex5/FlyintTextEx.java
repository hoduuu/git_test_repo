package ex5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FlyintTextEx extends JFrame {
	
	private final int FLYING_UNIT = 10; //레이블이 한번 움직이는 단위, px
	private JLabel la = new JLabel("Hello");
	
	//생성자
	FlyintTextEx(){
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		la.setLocation(50, 50);
		la.setSize(100,20);
		c.add(la);
		
		/*
		 * 키보드를 입력할 때 써줘야함.
		 * 컨텐트팬이 키 입력을 받을 수 있도록 강제 지정.
		 */
		c.setFocusable(true);
		c.requestFocus();
		
		//MouseAdapter
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
				//마우스가 클릭된 컴포넌트에게 포커스 설정.
			}
		});
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400,400);
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();//key code 값을 가져옴
			switch(keyCode) {
			
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+FLYING_UNIT, la.getY());
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-FLYING_UNIT, la.getY());
				break;
			}
			
		}
	}
	public static void main(String[] args) {
		new FlyintTextEx();
	}

}
