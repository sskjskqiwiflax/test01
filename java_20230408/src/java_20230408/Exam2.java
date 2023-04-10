package java_20230408;
//-3부터 100까지의 합
public class Exam2 {

	public static void main(String[] args) {
		
			int count=0;
			for(int i=-3 ; i<=100; i++) { 
				if(i %2==0)
				count++;
				System.out.println(i+",");
			}
			
			System.out.println("\n-3부터100까지의합 갯수:"+count);
	}
}		
		
		
	
