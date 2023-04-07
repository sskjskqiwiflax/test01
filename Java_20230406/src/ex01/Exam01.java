package ex01;
import java.util.*;
public class Exam01 {

		
	
	
	
  
	public static void main(String[] args) {
   
   		
    Scanner sc = new Scanner(System.in);
	   
	 System.out.println("국어 점수>>");
	 int kor=sc.nextInt();
	 System.out.println("영어 점수>>");
	 int eng =sc.nextInt();
	 System.out.println("수학 점수>>");
	 int math=sc.nextInt(); 
	
	 int total= kor+eng+math;
	 double average =  total/3.0;
	 
	 int sum= kor+eng+math;
	 
			 
	 
	 System.out.println("총점:"+sum);
	 System.out.println("평균 :"+(kor+eng+math)/3.0);
	 System.out.println("평균:%.f\n"+(kor+eng+math)/3.0);
			 
	}
}