package stem;

import java.util.Scanner;

public class leapYear {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int years = scanner.nextInt();
		scanner.close();
		boolean isLeapYear = ( years % 4 == 0 &&  years % 100 !=0)|| years % 400==0;
		String msg = isLeapYear ? years +"是闰年":years+"不是闰年";
		System.out.println(msg);
	}
}
