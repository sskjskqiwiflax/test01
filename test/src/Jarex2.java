
public class Jarex2 {

	
	
	public static void main(String[] args) {
        int X= 10;
        int y= 20;
        System.out.println("x ; " + X);  
        System.out.println("x ; " + y);
        System.out.println("------------------");
       
       int tmp = X;
        X = y;
        y=tmp; 
	    System.out.println("x ; " + X);  
        System.out.println("x ; " + y);
        System.out.println("tmp ;" + tmp);
           
	}
}

	

        