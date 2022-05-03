package ex3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame {

	private JLabel la = new JLabel("Hello");
	
	
	MouseListenerEx(){
	
		Container c = getContentPane();
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				la.setLocation(x, y);
				System.out.println("dd");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		c.setLayout(null);//레이아웃이 없다 ->좌표로 붙임
		la.setSize(50,20);
		la.setLocation(30, 30);
		c.add(la);
		

		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
/*
 * 어댑터(Adapter)클래스란,
 * 리스너 클래스를 상속받아 이벤트 리스너를 구현할 때,
 * 리스너의 메소드를 모두 구현해야하는 부담이 있다.
 * 
 * 그래서 자바의 JDK는 이런 부담을 줄여주기 위해
 * 리스너 인터페이스를 미리 구현해 놓은 클래스를 제공하는데
 * 이것을 어댑터 클래스라고 한다.
 */
