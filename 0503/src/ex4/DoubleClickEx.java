package ex4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DoubleClickEx extends JFrame{

	DoubleClickEx(){
		Container c= getContentPane();
		c.setLayout(null);
		c.addMouseListener(new MyMouseListener());
		this.setVisible(true);
		this.setSize(400,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount()==2) {//더블클릭
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				Component c = (Component)e.getSource();
				c.setBackground(new Color(r,g,b));

			}
		}
	}
	public static void main(String[] args) {
		new DoubleClickEx();
	}

}
