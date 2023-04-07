package java_20230407;
import java.util.*;
public class Exam10 {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
//		 	System.out.println("정수 입력");
//		 	int num= sc.nextInt();
//		 	
//		 	if(num>50) 
//		 		System.out.println("50이상의수");
//		 	
//		 	else
//		 		System.out.println("50미만의수");
//		 	
//		
//		 	
//		 	System.out.println("3의 배수");
//		 		num =sc.nextInt();
//		 		 if(num%3==0)
//		 			 System.out.println("3의배수");
//		 		 else
//		 			 System.out.println("아니다");
//		 	
//		 		 
//		 	
//		 		System.out.println("학년 입력"); 
//		 			int grade=sc.nextInt();
//		 		System.out.println("점수 입력");
//		 			int middle=sc.nextInt();
//		 		
//		 		if(grade==4 && middle>=70)
//		 		 System.out.println("4학년합격");
//		    
//		 		else if(grade<4 && middle>=60)
//		 		 System.out.println("그 외 학년 합격");
//		 		else if (middle<0|| middle >100)
//		 			System.out.println("0미만 100초과이면 경고문구 출력!");
//		 		else
//		 			System.out.println("불합격");
		 		 
		 	
		 		
		 			
		 		System.out.println("첫번째입력");
		 		  	int number1 = sc.nextInt();
		 		 System.out.println("두번째입력");
		 		 	int number2 = sc.nextInt();
		 		 System.out.println("세번째입력");
		 		 	int number3 = sc.nextInt();
		 		    
		 		 	if(number1>=number2 && number1>=number3)
		 		 		System.out.println(number1+"최대값");
		 		 	else if(number2>=number1 && number2>=number3)
		 		 		System.out.println(number2+"최대값");
		 		 	else if(number3>number2 && number3>number1)
		 		 		System.out.println(number3+"최대값");
		 		 	
		 		 	if(number2>=number1 && number3>=number1)
		 		 		System.out.println( number1+"최소값" );
		 		 	else if(number3>=number2 && number1>=number2)
		 		 		System.out.println( number2 +"최소값");
		 		 	else if (number2>=number3 && number1>=number3)
		 		 		System.out.println(number3+"최소값");
		 		 	
		 		 		System.out.println("합계: "+ (number1+number2+number3));
		 		 		System.out.println("평균값: "+ (number1+number2+number3)/3);
	
		 		 	
		 		 		
		 		 
		 		 		
		 		 		
		 		 		
		 		 		
		 		 		System.out.println("정수 입력");
		 		 			int num= sc.nextInt();
		 		 		 
		 		 		
		 		 		
		 		 		
		 		 		
		 		 
		 		 
		 		
		 		
		 		
		 		
		 		
		
	}

}
