package java_20230410;

public class Exam08 {

	public static void main(String[] args) {
		
		  int[]num=new int[10];
		  
		  for(int i=0; i<num.length; i++) 
			  num[i]=(int)(Math.random()*100+1);			 				
					
					for(int i=0; i<num.length; i++){	 
						for(int j=i; j<num.length;j++)
							if(num[i]< num[j]) {
							int tmp= num[i];
							num[i]= num[j];
							num[j]= tmp;
					
							}				
						System.out.print(num[i]+",");
		  
					}			 
					System.out.print("내림차순");
			 
		  }
	} 
			 
 
		  
			
			  
	  
	
		

	


