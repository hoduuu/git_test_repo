package ex1;

/*
 * �������̽��� ������ �ִ� �޼��� : �߻�ȭ�޼���
 * �������̽��� ������ �ִ� �ʵ� : final �ʵ�
 */
public class Button {
	
	OnClickListener listener; //OnClickListener ��� �������̽� ��ü ����
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick(); //�������̽��� onClick �޼��带 ����
	}
	
	static interface OnClickListener{
		void onClick();
	}
}
