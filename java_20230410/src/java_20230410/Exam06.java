package java_20230410;

public class Exam06 {
/* 
 * 1.로또 프로그램
 */
	public static void main(String[] args) {
		
	

			int[] lotto=new int[45];
			
			for(int i=0; i<lotto.length; i++)
				lotto[i]=i+1;
				
			for(int i=0; i<lotto.length; i++) {
				int num=(int)(Math.random()*45);
				int tmp=lotto[i];
				lotto[i]=lotto[num];
				lotto[num]=tmp;
			}		
				
				System.out.println("이번주 로또 번호는:");
				for(int i=0; i<6; i++)
					System.out.print(lotto[i]+",");
				
	}
			
			
}
				
				
				
				
				

			
			
			
			
							 
	

		
		
		
			

	

