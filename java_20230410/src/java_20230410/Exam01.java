package java_20230410;

public class Exam01 {

	public static void main(String[] args) {
		
			
		
		int 이름1,이름2,이름3,sum ;
		 이름1=이름2=이름3 = sum = 0;
		 double avg =0;
		이름1=(int)(Math.random()*50+1)+50;
		이름2=(int)(Math.random()*50+1)+50;
		이름3=(int)(Math.random()*50+1)+50;
		
				sum= 이름1+이름2+이름3;
				avg=sum/3.0;
				
				System.out.println(이름1+","+이름2+","+이름3);
				System.out.println(sum+","+avg);

		
	}

}
