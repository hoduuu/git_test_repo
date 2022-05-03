package ex1;

public class CallListener implements Button.OnClickListener{ //버튼에 있는 OnClickListener

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
	}

}
