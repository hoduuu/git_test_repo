package ex1;
/*/
 * RadioButton�� ��縸 Radio�̹Ƿ� �׷����� �����־����.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JRadioButton1 extends JFrame implements ActionListener {

	JLabel jl,jll;
	JRadioButton[] btn = new JRadioButton[5];
	String[] hobby = { "�ȱ�", "���", "����", "��Ų�����", "�з��۶��̵�" };

	JCheckBox[] jc = new JCheckBox[5];
	String[] age = { "20", "30", "40", "50", "60" };

	JPanel HobbypPanel = new JPanel();
	JPanel Agepanel = new JPanel();

	// �׷����� �����ش�.
	ButtonGroup gb = new ButtonGroup();

	public JRadioButton1() {
		for (int i = 0; i < 5; i++) {
			btn[i] = new JRadioButton(hobby[i]);
			jc[i] = new JCheckBox(age[i]);
			HobbypPanel.add(btn[i]);
			Agepanel.add(jc[i]);
			btn[i].addActionListener(this);
			jc[i].addActionListener(this);// ����� �׼Ǹ����� ���̰ڴ�
			gb.add(jc[i]);// �׷����� ���´� ->�Ѱ��� ���� ����
			gb.add(btn[i]);
		}
		
		jl = new JLabel();
		JLabel jl1 = new JLabel("����� ��̴�?");
		JLabel jl2 = new JLabel("����� ���̴�?");

		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3, 1));// 3�� 1��

		JPanel jp1 = new JPanel();
		jp1.add(jl1);
		jp1.add(HobbypPanel);

		JPanel jp2 = new JPanel();
		jp2.add(jl2);
		jp2.add(Agepanel);

		// �гο��� ���̱�.

		// ���� �г��� �����̳ʿ� ���̱�.

		JPanel jp3 = new JPanel();
		jp3.add(jl);
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);

		this.setVisible(true);
		this.setSize(450, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = "����� ��̴� :";
		for (int i = 0; i < hobby.length; i++) {
			if (btn[i].isSelected() == true) {
				s = s + hobby[i] + " ";
				jl.setText(s);
			}
			
		}
		String ss = "����� ���̴� :";
		jll.setText(ss + e.getActionCommand());
	}

}

public class JRadioButtonTest1 {
	public static void main(String[] args) {
		new JRadioButton1();
	}

}
