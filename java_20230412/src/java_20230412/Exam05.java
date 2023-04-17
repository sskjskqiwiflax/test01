package java_20230412;

public class Exam05 {

	public static void main(String[] args) {

	
	
	
			System.out.println("프로그램 시작");
		
			int total=sumFuction(100);
			
			System.out.println("total:"+total);
			
				
			System.out.println("프로그램 끝"+",");
	
	
	}
	static int sumFuction(int num) {
		int sum =0;
		
		for(int i=1; i<=num; i++)
			sum += i;
		
		return sum;
	}	
	
	
	
}
