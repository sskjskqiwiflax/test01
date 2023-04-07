package java_20230407;
import java.util.Scanner;
public class Exam09 {

	public static void main(String[] args) {
// 컴퓨터랑 가위바위보 게임
		int com = (int)(Math.random()*10)+1;    //0~9 정수 ==> 1 ~ 10
		
		System.out.println(com);
		Scanner sc= new Scanner(System.in);
		System.out.println("");
		
		
	
		int user=sc.nextInt();
			
		
	//	if(number>=90 && number<=100)
			System.out.println("A학점");
	//	else if(number>=80 && number<90)
			System.out.println("B학점");
	// if(number>=70 && number<80)
		System.out.println("C학점");
	//	else if(number>=60 && number <70)
			System.out.println("D학점");
	//	else if(number<60)
			System.out.println("F학점");
		
		System.out.println("프로그램 종료");
	



		
	}

}
