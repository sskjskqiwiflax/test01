package ex01;
import java.util.*;

public class Exam06 {
//
	public static void main(String[] args) {

		
		
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("나이 입력>");
			int 나이 =sc .nextInt();
			sc.nextLine();
			System.out.println("성별 입력>");
			String 성별 = sc.nextLine();
			
			
			if(성별.equals("남")) {
				if(나이>=22)
					System.out.println("잘가");
				else
					System.out.println("군대 안감");
				
			}else 
				System.out.println("군대 안감");
	}
}	