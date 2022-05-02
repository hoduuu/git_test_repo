package ex1;
/*/
 * RadioButton은 모양만 Radio이므로 그룹으로 묶어주어야함.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JRadioButton1 extends JFrame implements ActionListener {

	JLabel jl,jll;
	JRadioButton[] btn = new JRadioButton[5];
	String[] hobby = { "걷기", "등산", "골프", "스킨스쿠버", "패러글라이딩" };

	JCheckBox[] jc = new JCheckBox[5];
	String[] age = { "20", "30", "40", "50", "60" };

	JPanel HobbypPanel = new JPanel();
	JPanel Agepanel = new JPanel();

	// 그룹으로 묶어준다.
	ButtonGroup gb = new ButtonGroup();

	public JRadioButton1() {
		for (int i = 0; i < 5; i++) {
			btn[i] = new JRadioButton(hobby[i]);
			jc[i] = new JCheckBox(age[i]);
			HobbypPanel.add(btn[i]);
			Agepanel.add(jc[i]);
			btn[i].addActionListener(this);
			jc[i].addActionListener(this);// 여기다 액션리스너 붙이겠다
			gb.add(jc[i]);// 그룹으로 묶는다 ->한개만 선택 가능
			gb.add(btn[i]);
		}
		
		jl = new JLabel();
		JLabel jl1 = new JLabel("당신의 취미는?");
		JLabel jl2 = new JLabel("당신의 나이는?");

		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3, 1));// 3행 1열

		JPanel jp1 = new JPanel();
		jp1.add(jl1);
		jp1.add(HobbypPanel);

		JPanel jp2 = new JPanel();
		jp2.add(jl2);
		jp2.add(Agepanel);

		// 패널에다 붙이기.

		// 이제 패널을 컨테이너에 붙이기.

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
		String s = "당신의 취미는 :";
		for (int i = 0; i < hobby.length; i++) {
			if (btn[i].isSelected() == true) {
				s = s + hobby[i] + " ";
				jl.setText(s);
			}
			
		}
		String ss = "당신의 나이는 :";
		jll.setText(ss + e.getActionCommand());
	}

}

public class JRadioButtonTest1 {
	public static void main(String[] args) {
		new JRadioButton1();
	}

}
