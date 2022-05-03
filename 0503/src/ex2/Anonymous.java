package ex2;

public class Anonymous {
	//필드 초기값으로 대입.
	//Person field = new Person(); //일반적인 방법
	
	Person field = new Person() { //Person의 자식클래스 내용 + Person의 함수 Override
		
		void work() {
			System.out.println("출근합니다.");
		
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
		}
		
	};
	
	void method1() {
		
		Person localVal = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				walk();
			}
		};
		
		localVal.wake();
		
	}
	void method2(Person person) {
		person.wake();
	}
}
