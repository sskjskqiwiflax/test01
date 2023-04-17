package java_20230413;

class Tv{
	//멤버변수,필드
	String clolr;
	boolean power;
	int channel;
		
	//메소드, 멤버함수
	void power() {power=!power;}
	void channelup() {channel++;}
	void channelDown() { channel--; }
}	

public class TvTest01 {

	public static void main(String[] args) {
		
		int num =10;	
		int kor =90;
		Tv tv =new Tv();
		tv.clolr =	"검정";
		tv.channelup ();
		tv.channelup();
		System.out.println(tv.clolr);
		System.out.println(tv.channel);
		
		Tv lgtv = new Tv();
		lgtv.clolr="흰색";
		System.out.println(lgtv.clolr);
		System.out.println(lgtv.channel);
		
		
		
		
		
			
	}

}
