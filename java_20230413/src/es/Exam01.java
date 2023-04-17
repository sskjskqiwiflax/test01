package es;

class Member{
	int age;	//멤버변수,인스턴스 변수
	static int num; //클래스 변수,정적변수,공유변수
}
public class Exam01 {

	public static void main(String[] args) {
		
		
		Member m=new Member();
		
		m.age =20;
		m.num=30;
		
		Member m2=new Member();
		
		m2=m;
		m2.age=50;
		
		System.out.println(m.age);
		System.out.println(m2.age);
		
		
	}
}
