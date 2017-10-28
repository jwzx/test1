package stem;

public class Emp {
	String name;
	int age;
	char gender;
	double salary;
	
	
	
	public void printInfo(){//定义在类中，直接对成员变量进行操作
		System.out.println("--------------------------");
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("性别："+gender);
		System.out.println("薪水："+salary);
		
	}
}
