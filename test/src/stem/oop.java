package stem;

import org.eclipse.emf.ecore.EModelElement;

public class oop {
	public static void main (String[] args){
		String emp1Name="�ƺӴ���";
		int emp1Age=25;
		char emp1Gender='��';
		double emp1Salary=8000.00;
		
		Emp emp1=new Emp();
		emp1.name="�ƺӴ���";
		emp1.age=25;
		emp1.gender='��';
		emp1.salary=1000.00;
		
		printEmpInfo(emp1);
		emp1.salary*=120.0/100;
		printEmpInfo(emp1);
				
				
	}
	public static void printEmpInfo(Emp emp){
		System.out.println("-----------------------------");
		System.out.println("������"+emp.name);
		System.out.println("���䣺"+emp.age);
		System.out.println("�Ա�"+emp.gender);
		System.out.println("нˮ��"+emp.salary);
	}
}
