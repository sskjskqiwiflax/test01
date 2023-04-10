package java_20230408;
//2와 3의 배수 
public class Exam00 {

	public static void main(String[] args) {
		
		
			int count=0;
			int i =0;
			for(i=1; i<=100;i++) {
				if(i%2==0 && i %3==0) {
			count++;
			System.out.print(i+", ");
			}	
			}
				System.out.println("\n2와3의배수 갯수:"+count);
			
			
}
}
