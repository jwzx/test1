package stem;

import org.eclipse.emf.ecore.EModelElement;

public class oop {
	public static void main (String[] args){
		String emp1Name="黄河大侠";
		int emp1Age=25;
		char emp1Gender='男';
		double emp1Salary=8000.00;
		
		Emp emp1=new Emp();
		emp1.name="黄河大侠";
		emp1.age=25;
		emp1.gender='男';
		emp1.salary=1000.00;
		
		printEmpInfo(emp1);
		emp1.salary*=120.0/100;
		printEmpInfo(emp1);
				
				
	}
	public static void printEmpInfo(Emp emp){
		System.out.println("-----------------------------");
		System.out.println("姓名："+emp.name);
		System.out.println("年龄："+emp.age);
		System.out.println("性别："+emp.gender);
		System.out.println("薪水："+emp.salary);
	}
}
