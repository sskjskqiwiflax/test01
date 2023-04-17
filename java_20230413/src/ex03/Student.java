package ex03;

class Student{
	String name;
	String address;
	int age;
	int count;
	void displtinfo() {
		System.out.println(name+","+ age + ","+
					address+"현재 학생수:"+ count);
	}
	
}

public class Student {

	public static void main(String[] args) {

		
		student	kim =new student();
		kim.name = "김씨요";
		kim.age=20;
		kim.address="수원이요";
	
		student	park =new student();
		park.name = "박씨요";
		park.age=200;
		park.address="천당이요";
		
		student lee = new student();
		student hong =  new student();
		
		kim .displtinfo();
		park.displtinfo();
		lee .displtinfo();
		hong.displtinfo();
	}

	
}