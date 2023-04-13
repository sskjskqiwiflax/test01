package java_20230411;

public class Eam01 {

	public static void main(String[] args) {
		
		
		int num[] = new int [10];
			
		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*100);
			System.out.print(num[i]+",");}
			System.out.println("랜덤 생성");
		
		
		
			int sum=0;
			double average= 0;
			
				
			for(int i=0; i<num.length; i++) {
				sum += num[i];
			}		
				
			System.out.println("총점"+sum);	
			System.out.println(average=sum/(double)num.length);	
			
			
			
			
			
			
			
		}
	
	
	}

		








