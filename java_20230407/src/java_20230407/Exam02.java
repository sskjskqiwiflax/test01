package java_20230407;
import java.util.*;
public class Exam02 {
/*
*  숫자 하나 입력 받아서 양수, 음수,  zero로 출력
*/
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		      System.out.println("정수 입력>");
		    int num = sc.nextInt();
		    
		   if (num>0)
			   System.out.println("정수");
		   else if (num<0)
		   		System.out.println("양수");
		   else 
			   System.out.println("zero");
		      
		      
		      
		      
	}

}
