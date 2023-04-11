package java_20230409;
/*
+
++	
+++
++++
+++++
행 :i
열 :j
*/
public class Exam03 {
	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for(int j=0; j<1+i; j++)
				System.out.print("+");
			System.out.println();
		}
		
	}
}