package java_20230411;
import java.util.Arrays;
public class Exam02 {

	public static void main(String[] args) {

		
		int[]arrNum= {10,20,30,40,50};
		System.out.println(Arrays.toString(arrNum));
		
		int[] arrNum2 = new int[10];
		
		for(int i=0; i<arrNum.length; i++)
			arrNum2[i]=arrNum[i];
			
		System.out.println(Arrays.toString(arrNum2));
		
		
		
		
		
		
		
		
		int[]arr= {10,20,30,40,50};
		int[]arr2= new int[10];
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
	
	

}
