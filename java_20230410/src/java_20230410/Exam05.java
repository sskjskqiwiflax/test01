package java_20230410;

public class Exam05 {
/* 
 * 1.int 배열 10개생성
 * 2.랜덤함수 이용해서 10개 초기화
 * 3.최대값,최소값 출력
 */
	public static void main(String[] args) {
		
	
		int[] num =new int[10];
		int max;
		int min;
		
		
		for(int i=0; i<num.length; i++)
			num[i] = (int)(Math.random()*100+1);
		
		for(int i=0; i<num.length; i++)
			System.out.print(num[i]+",");
			System.out.println();
			
			System.out.println("오름차순 정렬!!");
			
			for(int i=0; i<num.length; i++)
				for(int j=0;j<num.length; j++ ) {
					if(num[i]>num[j]) {
						int tmp=num[i];
						num[i]=num[j];
						num[j]=tmp;
						
					}
				}
			for(int i=0; i<num.length; i++)
				System.out.println(num[i]+",");	 
			
			
			
	}	
				 
	
}	
		
		
		
			

	

