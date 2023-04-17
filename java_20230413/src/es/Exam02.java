package es;
//함수 이름 같음, 2 매개변수 타입거나 갯수가 틀려야한다..
class Member{
	int func(int n) {
		return n;
	}
	double func(double d) {
		return d;
		
	}
	String func(String str) {
		return str;
	}
	void func(int n1, int n2) {
		System.out.println(n1+n2);
	}
	

}

public class Exam02 {

	public static void main(String[] args) {
		Member m=new Member();
		
		System.out.println(m.func(10));
	}

}
