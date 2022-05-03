package ex3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnnonymousClassListener extends JFrame {

	public AnnonymousClassListener() {

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				if (b.getText().equals("Action"))
					b.setText("¾×¼Ç");
				else
					b.setText("Action");
				setTitle(b.getText());
			}
		});

		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 400);
	}

	public static void main(String[] args) {
		new AnnonymousClassListener();
	}

}
