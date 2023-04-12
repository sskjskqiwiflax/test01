package java_20230409;
import java.util.Scanner;
public class Exam14 {
 
	public static void main(String[] args) {
	
		
		
		Scanner sc =new Scanner(System.in);
		
		int com=(int)(Math.random()*100)+1;
		int user=0;
		int count=0;
	    	
			while(true) {
				System.out.println("정수 입력>");
				user=sc.nextInt();
				count++;
			if(com == user)	{
				System.out.println("정답입니다.");
				break;
			
			}else if(com>user)
				System.out.println("com 은 작은 수입니다");
			else if(com<user)
				System.out.println("com은 큰 수입니다");
			}
			System.out.println(count+"회 맞춤");
			System.out.println("com:"+com+"user:"+user);
				
				
				
				
				
			}
}		
		
		
		
	    		
		
		
	