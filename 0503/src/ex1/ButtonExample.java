package ex1;

public class ButtonExample {

	public static void main(String[] args) {
		Button b = new Button();
		b.setOnClickListener(new CallListener());
		b.touch();
		b.setOnClickListener(new MessageListener());
		b.touch();
	}

}
