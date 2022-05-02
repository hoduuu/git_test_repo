package ex1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CheckBox1 extends JFrame {

	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = { "사과", "배", "체리" };
	private JLabel sumLabel; // print sum label

	public CheckBox1() {

		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(new JLabel("사과 100원, 배 500원, 체리 2000원	"));

//		this.setVisible(true);
//		this.setSize(250, 250);
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		MyItemListener listener = new MyItemListener(); // 클래스에 접근하기 위해 선언.

		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);// 체크박스에 배열 1:1
			fruits[i].setBorderPainted(true);// 박스테두리
			ct.add(fruits[i]);// 컨테이너에 붙인다
			fruits[i].addItemListener(listener);// 아이템리스너
		}

		sumLabel = new JLabel("현재 0원 입니다.");
		ct.add(sumLabel);

		this.setVisible(true);
		this.setSize(250, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	class MyItemListener implements ItemListener {

		private int sum;

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {// 선택되었다면
				if (e.getItem() == fruits[0])// 가격을 더한다
					sum += 100;
				else if (e.getItem() == fruits[1])
					sum += 500;
				else
					sum += 2000;
			} else {// 체크박스를 해제하면 빼준다
				if (e.getItem() == fruits[0])
					sum -= 100;
				else if (e.getItem() == fruits[1])
					sum -= 500;
				else
					sum -= 2000;
			}
			sumLabel.setText("현재 " + sum + " 원 입니다.");
		}

	}
}

public class CheckBoxItemEvent {

	public static void main(String[] args) {
		new CheckBox1();

	}

}
