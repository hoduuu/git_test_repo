package ex2;

public class Anonymous {
	//�ʵ� �ʱⰪ���� ����.
	//Person field = new Person(); //�Ϲ����� ���
	
	Person field = new Person() { //Person�� �ڽ�Ŭ���� ���� + Person�� �Լ� Override
		
		void work() {
			System.out.println("����մϴ�.");
		
		}
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
		}
		
	};
	
	void method1() {
		
		Person localVal = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		
		localVal.wake();
		
	}
	void method2(Person person) {
		person.wake();
	}
}
