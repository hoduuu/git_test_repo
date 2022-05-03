package ex2;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		// 익명 객체 필드 사용
		anony.field.wake();

		// 익명 객체 로컬 변수 사용
		/*
		 * **순서**
		 * method1 -> localVal.wake() -> wake()의 walk() 
		 * 8시에 일어납니다. -> 산책합니다.
		 */
		anony.method1();

		anony.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				System.out.println("11시에 일어납니다.");
				study();
			}
		}

		);
	}

}
