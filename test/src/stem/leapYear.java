package stem;

import java.util.Scanner;

public class leapYear {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int years = scanner.nextInt();
		scanner.close();
		boolean isLeapYear = ( years % 4 == 0 &&  years % 100 !=0)|| years % 400==0;
		String msg = isLeapYear ? years +"������":years+"��������";
		System.out.println(msg);
	}
}
