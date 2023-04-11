package java_20230409;
import java.util.Scanner;
public class Exam09 {
//int 타입의 변수 num이 있을때 각 자리의 합을 더한 결과를 출려하는 코드를
//	완성하라 만일 변수 num 의 값이 12345 라면, 1+2+3+4+5 의 경과인 15를 출력 주의,문자열로 변환하지말고 숫자로만 처리해야한다
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int num = 12345;
		int sum = 0;
		
		while(num>0) { 
				sum += num % 10;  //5
				num = num /10;   //1234
		
		}
		System.out.println(num);
		System.out.println("sum="+sum);
		
	}
	
	
}
	
    