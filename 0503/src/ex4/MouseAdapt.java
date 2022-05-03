package ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAdapt extends JFrame {

	private JLabel la = new JLabel("Hello");

	public MouseAdapt() {

		Container c = getContentPane();
		c.setLayout(null);
		c.add(la);
		c.addMouseListener(new MyMouseAdapter());

		la.setSize(40, 30);
		la.setLocation(30, 30);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 400);
	}

	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}

	public static void main(String[] args) {
		new MouseAdapt();
	}

}
