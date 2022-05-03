package ex2;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		// �͸� ��ü �ʵ� ���
		anony.field.wake();

		// �͸� ��ü ���� ���� ���
		/*
		 * **����**
		 * method1 -> localVal.wake() -> wake()�� walk() 
		 * 8�ÿ� �Ͼ�ϴ�. -> ��å�մϴ�.
		 */
		anony.method1();

		anony.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("11�ÿ� �Ͼ�ϴ�.");
				study();
			}
		}

		);
	}

}
