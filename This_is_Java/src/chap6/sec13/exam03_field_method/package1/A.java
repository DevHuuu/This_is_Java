package chap6.sec13.exam03_field_method.package1;

//필드와 메소드의 접근 제한
public class A {
	//필드
	public int field1;	//public 접근제한
	int field2;			//default 접근제한
	private int field3; //private 접근제한
	
	//생성자
	public A() {		//어떤 접근제한자가 와도 클래스 내부에서는 제한을 받지 않는다.
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
		
	}

	public void method1() {}	//public 접근제한
	void method2() {}			//default 접근제한
	private void method3() {}	//private 접근제한
}
