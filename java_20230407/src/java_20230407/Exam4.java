package java_20230407;
import java.util.*;
public class Exam4 {

	public static void main(String[] args) {

		
		Scanner sc =new Scanner(System.in);
		   
		System.out.println("숫자 입력");
			int num =sc.nextInt();
	
						
		if(num %2==0 && num %3==0)
			System.out.println("2와 3의배수입니다");
		else    
			System.out.println("2와 3의 배수가아닙니다");
	}

}
