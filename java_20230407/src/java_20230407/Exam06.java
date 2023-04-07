package java_20230407;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("학년입력>");
		 
		int grade =sc.nextInt();               //final int one=1;
		 
		switch(grade) {
		case 1:  
		System.out.println("1학년");
		 	break;
		case 2:
			System.out.println("2학년");
			break;
		case 3:
			System.out.println("3학년");
			break;
		case 4:
			System.out.println("4학년");
		  default:
			  System.out.println("프로그램 종료");
		
		}
		
		
		
	
	}

}
