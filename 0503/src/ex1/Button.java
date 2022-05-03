package ex1;

/*
 * 인터페이스가 가지고 있는 메서드 : 추상화메서드
 * 인터페이스가 가지고 있는 필드 : final 필드
 */
public class Button {
	
	OnClickListener listener; //OnClickListener 라는 인터페이스 객체 생성
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick(); //인터페이스의 onClick 메서드를 실행
	}
	
	static interface OnClickListener{
		void onClick();
	}
}
