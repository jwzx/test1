package stem;

import java.util.Scanner;



public class stem {
	public static void main (String[] agrs){
		Scanner console = new Scanner(System.in);
		System.out.println("�����뵥�ۣ�");
		double unitPrice = console.nextDouble();
		System.out.println("������������");
		double acount=console.nextDouble();
		System.out.println("�������");
		double money=console.nextDouble();
		console.close();
		
		//������Ʒ�ܼ�
		
		double totalPrice=0.0;
		totalPrice=unitPrice*acount;
		if(totalPrice>=500){
			totalPrice=totalPrice*0.8;
		}
		//��������
		
		double change = money-totalPrice;
		if(change>=0){
			System.out.println("Ӧ�ս��Ϊ����"+totalPrice+" ;���㣺��"+change);
		}else{
			System.out.println("�����Ǯ���������"+(-change));
		}
	}
	
}
