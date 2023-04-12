package java_20230410;

public class Exam02 {

	public static void main(String[] args) {
		
			
		final int max=3;
		int sum =0;
		double avg =0;
		int[]조4=new int[5];
		for(int i=0; i<max; i++) {
			조4[max]=(int)(Math.random()*50+1)+50;
		}	
				
		for(int i=0; i<max;i++)
			sum+=조4[i];
		avg= sum/3.0;
		
		for(int i=0; i<max; i++)
			System.out.print(조4[max]+",");
			
		System.out.println();
		System.out.println(sum+","+avg);
			
			
		
		
	}

}
