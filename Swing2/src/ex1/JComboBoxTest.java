package ex1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComboTest extends JFrame implements ItemListener{

	JLabel jl;
	JComboTest(){
		jl = new JLabel();
		JComboBox jcb = new JComboBox();
		
		String fr[] = {"persimmom","banana","pear","apple","cherry","grape"};
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		for(int i = 0; i < fr.length; i ++) {
			jcb.addItem(fr[i]);//ºÙ¿´À½.
			
		}
		ct.add(jcb);
		ct.add(jl);
		
		this.setSize(200,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
	}
	
}

public class JComboBoxTest {

	public static void main(String[] args) {
		new JComboTest();
	}

}
