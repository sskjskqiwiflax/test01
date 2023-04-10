package java_20230408;

import java.util.*;
public class Exam08 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		  
		 
		 
		     int balance=0;
		 
		 for(;true;) {
			 System.out.println("-----------------------");
			 System.out.println("1.예금|2.출금|3.잔고|4.종료");
			 System.out.println("-----------------------");
			 
			 int number=sc.nextInt();
			 
			 switch(number) {
			 	case 1:
			 		System.out.println("예금>");
			 		balance +=sc.nextInt();
			 		break;
			 	case 2:
			 		System.out.println("출금>");
			 		balance -=sc.nextInt();
			 		break;
			 	case 3:	
			 		System.out.println("잔고>");
			 		System.out.println("현재 잔고:"+ balance);
			 		break;
			 
			 	case 4:
			 		System.out.println("선택>");
			 		
			 }
			 
			 		if(number ==4)break;
		 }		
			 		System.out.println("프로그램 종료.");
			 		
	} 	
			 	
}		 	
		 
		 
				
				
				
				
				
				
	
	
	
	
	
	
	



	
	
	
	
	
