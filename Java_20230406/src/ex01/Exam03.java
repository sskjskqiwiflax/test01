package ex01;
import java.util.*;
/*
 * 나의 이름, 주소, 나이 (만으로입력)을 입력 받아서 출력하는 프로그램 작성..(단 나이는 +1해서 출력)
 */


public class Exam03 {

	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        //nextline, nextint
        
        String name= sn.nextLine();
        String adress= sn.nextLine();
        int age= sn.nextInt();
        sn.nextInt(); //입력버퍼 남아있는 엔터를 제거해라.
        //이유는 엔터를 제거하지 않으면 string name = sn nextLine()이 문장에서 엔터를
        //문장으로 인신해서 버퍼 남은 엔터를 name변수에 넣는다.
        System.out.println("이름:"+name);
        System.out.println("주소:"+adress);
        System.out.println("나이:"+(age+1));
        
        
        
        
        
        
        
        
	}

}
