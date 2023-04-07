package java_20230407;
import java.util.Scanner;
public class Exam08 {

	public static void main(String[] args) {
// 컴퓨터랑 가위바위보 게임
		int com = (int)(Math.random()*10)+1;    //0~9 정수 ==> 1 ~ 10
		
		System.out.println(com);
		Scanner sc= new Scanner(System.in);
		System.out.println("(가위), (바위), (보), 중 입력하세요>");
		int user=sc.nextInt();
			 
		switch(user-com) {
		case 0 :
			System.out.println("비김");
			break;
		case -2:
		case 1:
			System.out.println("user 승!");
			break;
		case -1:
		case 2:
			System.out.println("com 승!");
			break;
		}
		System.out.println("User: "+ user +",Com :"+ com);
		
		
	}

}
