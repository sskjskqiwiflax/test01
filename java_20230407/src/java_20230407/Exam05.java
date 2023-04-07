package java_20230407;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("계절입력>");
		 String season =sc.nextLine();
		 								// char ch = 'A' ;
		 switch (season) {           //정수 문자열만 올수있다
		 case "spring" :				//case 'A' :
		  System.out.println("봄이다");
		  	break;
		 case "summer" :
		   System.out.println("여름이다");  
		   break;
		 case "fall" :
		   System.out.println("가을이다");
		   break;
		 case "winter" :
		  System.out.println("겨울이다");
		  break;
		 default :
			 System.out.println("아직도.....");
		 }
	
	}

}
