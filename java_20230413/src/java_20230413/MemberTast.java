package java_20230413;

class Member{
	String name;
	String id;
	String password;
	int age;
	
	boolean login(String id, String pw) {
		if(id.equals("홍길동")&& pw.equals("12345"))
		return true;
		else return false;
	}	
		void logout(String id) {
			System.out.println(id+"님 로그아웃되었습니다.");
		}
	}
	public class MemberTast {

	public static void main(String[] args) {

		Member m =new Member();
		
		Boolean b = m.login("로이", "1234");
		if(b==true)
			System.out.println("로그인 성공");
		else 
			System.out.println("로그인 실패");
		
		Boolean b2 =m.login("홍길동", "12345");
		
		
	
	
	
	
	
	
	}
	
	
	

}



