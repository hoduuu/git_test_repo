package ex7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class rd extends JFrame {
	
	private JRadioButton[] radio = new JRadioButton[3];
	private String[] text = {"���","��","ü��"};
	private ImageIcon[] image = {
			new ImageIcon("img/apple.png"),
			new ImageIcon("img/pear.png"),
			new ImageIcon("img/cherry.png")
			
	};
	
	//�̹����� ��µ� ���̺� �ۼ�
	private JLabel imageLabel = new JLabel();
	
	public rd() {
	
		Container c= getContentPane();
		c.setLayout(new BorderLayout());
		
		//3���� ���� ��ư�� ������ JPanel
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.gray);
		
		
		ButtonGroup g= new ButtonGroup();
		for(int i = 0; i <radio.length; i ++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);//�׷쿡�� ���δ�.
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
			
		}
		//c.add(radioPanel);
		//ü�� ���� ��ư�� ���� ���·� ����.
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel,BorderLayout.CENTER);
		
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)//���õ����ʾҴٸ�
				return;
			if(radio[0].isSelected())//����� �����Ѱ��
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())//�� ����
				imageLabel.setIcon(image[1]);
			else//ü�� ����
				imageLabel.setIcon(image[2]);
		}
		
	}
}

public class RdioEx {

	public static void main(String[] args) {
		new rd();
	}

}
