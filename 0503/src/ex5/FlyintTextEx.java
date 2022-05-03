package ex5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FlyintTextEx extends JFrame {
	
	private final int FLYING_UNIT = 10; //���̺��� �ѹ� �����̴� ����, px
	private JLabel la = new JLabel("Hello");
	
	//������
	FlyintTextEx(){
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		la.setLocation(50, 50);
		la.setSize(100,20);
		c.add(la);
		
		/*
		 * Ű���带 �Է��� �� �������.
		 * ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ���� ����.
		 */
		c.setFocusable(true);
		c.requestFocus();
		
		//MouseAdapter
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
				//���콺�� Ŭ���� ������Ʈ���� ��Ŀ�� ����.
			}
		});
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400,400);
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();//key code ���� ������
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
