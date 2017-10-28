package stem;

import java.util.Scanner;



public class stem {
	public static void main (String[] agrs){
		Scanner console = new Scanner(System.in);
		System.out.println("请输入单价：");
		double unitPrice = console.nextDouble();
		System.out.println("请输入数量：");
		double acount=console.nextDouble();
		System.out.println("请输入金额：");
		double money=console.nextDouble();
		console.close();
		
		//计算商品总价
		
		double totalPrice=0.0;
		totalPrice=unitPrice*acount;
		if(totalPrice>=500){
			totalPrice=totalPrice*0.8;
		}
		//计算找零
		
		double change = money-totalPrice;
		if(change>=0){
			System.out.println("应收金额为：￥"+totalPrice+" ;找零：￥"+change);
		}else{
			System.out.println("你给的钱不够还差：￥"+(-change));
		}
	}
	
}
