package chap8._interface.defaultmethods.extend;

public class ChildExample {
	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() {
				System.out.println("Child1-method1() 실행");
			}
			@Override
			public void method3() {
				System.out.println("Child1-method3() 실행");
			}
		};
		
		ci1.method1();
		ci1.method2();	//ParentInterface의 method2() 호출
		ci1.method3();
		
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {
				System.out.println("Child2-method1() 실행");
			}
			@Override
			public void method3() {
				System.out.println("Child2-method3() 실행");
			}
		};
		
		ci2.method1();
		ci2.method2();	//ChildInterface2의 method2() 호출
		ci2.method3();
		
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {
				System.out.println("Child3-method1() 실행");
			}
			@Override
			public void method2() {
				System.out.println("Child3-method2() 실행");
			}
			@Override
			public void method3() {
				System.out.println("Child3-method3() 실행");
			}
		};
		
		ci3.method1();
		ci3.method2();	//ParentInterface의 method2() 호출
		ci3.method3();
		
		
	}
}
