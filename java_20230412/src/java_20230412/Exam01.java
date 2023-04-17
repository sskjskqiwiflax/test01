package java_20230412;
import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {
		int[] n=new int[5];
		
		
		System.out.println("======================");
		
		int[][] num=new int[5][5];
		int count=0;
		for(int i =0; i<num.length; i++)
			for(int j=0; j<num[i].length; j++)
				num[i][j]=++count;
		
		
		for(int i =0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++)
				System.out.printf("%2d,",num[i][j]);
				System.out.println();
		
		
		
	}

}
}