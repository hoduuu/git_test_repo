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
		c.setLayout(null);//���̾ƿ��� ���� ->��ǥ�� ����
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
 * �����(Adapter)Ŭ������,
 * ������ Ŭ������ ��ӹ޾� �̺�Ʈ �����ʸ� ������ ��,
 * �������� �޼ҵ带 ��� �����ؾ��ϴ� �δ��� �ִ�.
 * 
 * �׷��� �ڹ��� JDK�� �̷� �δ��� �ٿ��ֱ� ����
 * ������ �������̽��� �̸� ������ ���� Ŭ������ �����ϴµ�
 * �̰��� ����� Ŭ������� �Ѵ�.
 */
