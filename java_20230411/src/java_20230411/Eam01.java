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
			
				
			for(int i=0; i<num.length; i++) 
				sum += num[i];
					

				System.out.println("총점"+sum);	
				System.out.println(average=sum/(double)num.length);	
				
				int max,min;
				max = min=num[0];
				
				for(int i=0; i<num.length; i++) {
						if(num[i]>max) {
					     max=num[i];
				}		else if(num[i] <min) {
							min=num[i];
				}
	}			

				System.out.println("최대값:"+max);
				System.out.println("최소값:"+min);
				
		
				
				for(int i=0; i<num.length; i++) {
					for(int j=i; j<num.length; j++) 
						if(num[i]>num[j]) {
						int tmp=num[i];
						 num[i]=num[j];
						 num[j]=tmp;
				
	                  }
						
					System.out.print(num[i]+",");
				}
					System.out.println("오름차순");
				}			
			
	}
							
					

		
				
				
		
	
				
				
			
	
				
			
			
			
				
			
		
	
	
	

		



	




