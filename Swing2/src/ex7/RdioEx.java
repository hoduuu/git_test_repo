package ex7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class rd extends JFrame {
	
	private JRadioButton[] radio = new JRadioButton[3];
	private String[] text = {"사과","배","체리"};
	private ImageIcon[] image = {
			new ImageIcon("img/apple.png"),
			new ImageIcon("img/pear.png"),
			new ImageIcon("img/cherry.png")
			
	};
	
	//이미지가 출력될 레이블 작성
	private JLabel imageLabel = new JLabel();
	
	public rd() {
	
		Container c= getContentPane();
		c.setLayout(new BorderLayout());
		
		//3개의 라디오 버튼을 부착할 JPanel
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.gray);
		
		
		ButtonGroup g= new ButtonGroup();
		for(int i = 0; i <radio.length; i ++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);//그룹에다 붙인다.
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
			
		}
		//c.add(radioPanel);
		//체리 라디오 버튼을 선택 상태로 설정.
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
			if(e.getStateChange() == ItemEvent.DESELECTED)//선택되지않았다면
				return;
			if(radio[0].isSelected())//사과를 선택한경우
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())//배 선택
				imageLabel.setIcon(image[1]);
			else//체리 선택
				imageLabel.setIcon(image[2]);
		}
		
	}
}

public class RdioEx {

	public static void main(String[] args) {
		new rd();
	}

}
