package ex1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CheckBox1 extends JFrame {

	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = { "���", "��", "ü��" };
	private JLabel sumLabel; // print sum label

	public CheckBox1() {

		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(new JLabel("��� 100��, �� 500��, ü�� 2000��	"));

//		this.setVisible(true);
//		this.setSize(250, 250);
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		MyItemListener listener = new MyItemListener(); // Ŭ������ �����ϱ� ���� ����.

		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);// üũ�ڽ��� �迭 1:1
			fruits[i].setBorderPainted(true);// �ڽ��׵θ�
			ct.add(fruits[i]);// �����̳ʿ� ���δ�
			fruits[i].addItemListener(listener);// �����۸�����
		}

		sumLabel = new JLabel("���� 0�� �Դϴ�.");
		ct.add(sumLabel);

		this.setVisible(true);
		this.setSize(250, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	class MyItemListener implements ItemListener {

		private int sum;

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {// ���õǾ��ٸ�
				if (e.getItem() == fruits[0])// ������ ���Ѵ�
					sum += 100;
				else if (e.getItem() == fruits[1])
					sum += 500;
				else
					sum += 2000;
			} else {// üũ�ڽ��� �����ϸ� ���ش�
				if (e.getItem() == fruits[0])
					sum -= 100;
				else if (e.getItem() == fruits[1])
					sum -= 500;
				else
					sum -= 2000;
			}
			sumLabel.setText("���� " + sum + " �� �Դϴ�.");
		}

	}
}

public class CheckBoxItemEvent {

	public static void main(String[] args) {
		new CheckBox1();

	}

}
