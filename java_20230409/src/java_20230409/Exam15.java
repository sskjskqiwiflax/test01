package java_20230409;
import java.util.Scanner;
public class Exam15 {
 
	public static void main(String[] args) {
	
			Scanner sc=new Scanner(System.in);
			int count=0;
			int sum =0;
			System.out.println("몇회 입력>>");
			int number=sc.nextInt();
			
			while(count<number) {
				System.out.println("숫자를 입력하세요:");
				if(sc.hasNextInt()) {
					int num =sc.nextInt();
					if(num % 2==0) {
						sum+=num;
						
				}
				count++;
				}else if(sc.hasNextInt()) {
					sc.nextInt();
					System.out.println("실수는 입력 불가입니다. 다시 입력하세요..");
				}else {
					sc.next();
					System.out.println("문자는 입력 불가입니다. 다시 입력하세요..");
				}
				
			}
			System.out.println("짝수의 합:"+sum);
			
					
	
		
	}
}
