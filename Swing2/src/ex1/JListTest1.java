package ex1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Jlist1 extends JFrame implements ListSelectionListener {

	String[] frList = { "persimmom", "banana", "pear", "apple", "cherry", "grape" };

	private JList jlist = new JList(frList);
	
	private ImageIcon[] frIcons = {	
			new ImageIcon("D:\\fruits\\persimmom.png"),
			new ImageIcon("D:\\fruits\\banana.png"),
			new ImageIcon("D:\\fruits\\pear.png"),
			new ImageIcon("D:\\fruits\\apple.png"),
			new ImageIcon("D:\\fruits\\cherry.png"),
			new ImageIcon("D:\\fruits\\grape.png")		
			
	};
	
	private JLabel[] jlicon = new JLabel[6]; //아이콘을 위한 라벨 객체
	private JLabel jlname = new JLabel(); //라벨을 저장할 객체 생성

	public Jlist1() {
		Container ct = getContentPane();
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3,2,5,5));
		
		for(int i = 0; i < frList.length; i++) {
			p1.add(jlicon[i] = new JLabel());
		}
		JPanel p2 = new JPanel();
		p2.add(jlname);
		ct.add(jlist,BorderLayout.WEST);
		ct.add(p1,BorderLayout.CENTER);
		ct.add(p2, BorderLayout.EAST);
		
		jlist.addListSelectionListener(this);
		setTitle("Jlist");
		this.setVisible(true);
		this.setSize(400,400);
		
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		for(int i = 0; i < 6; i++) {
			jlicon[i].setIcon(null);
		}
		int[] indices = jlist.getSelectedIndices();
		
		String s = " 당신이 선택한 항목은 ";
		for(int j = 0; j < indices.length; j++ ) {
			jlicon[j].setIcon(frIcons[indices[j]]);
			s = s + frList[indices[j]]+" ";
		}
		jlname.setText(s);
	}

}

public class JListTest1 {

	public static void main(String[] args) {
		new Jlist1();
	}

}
