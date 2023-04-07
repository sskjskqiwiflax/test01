package java_20230407;
import java.util.*;
public class Exam03 {
/*
*  숫자 하나 입력 받아서 홀수 짝수 인지
*/
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		   
		System.out.println("숫자 입력");
			int num =sc.nextInt();
			
			if(num% 2 ==0)
				System.out.println("짝수");
			else if(num%1==0) 
			 	System.out.println("홀수");
			
		      
		      
		      
	}

}
