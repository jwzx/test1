package stem;

import java.util.Scanner;


public class levelForIf {
	 public static void main (String[] args){
		 Scanner console = new Scanner(System.in);
		 System.out.println("请输入你猜测的数字（1-1000),退出按0");
		 int score=console.nextInt();
		
		//生成一个随机数作为猜测结果
		 int num =(int) (Math.random()*1000)+1;
		 System.out.println("num:"+num);
		 int a=0;
		 while(num!=score){
			 if(num<score){
				 System.out.println("太大了");
			 }else if(num>score){
				 System.out.println("太小了");
			 }else if(score==0){
				 System.out.println("退出");
				 break;
			 }else if(a>6){
				 System.out.println("很遗憾");
				 break;
			 }
			 System.out.println("请输入你猜测的数字（1-1000），退出请按0");
			 score=console.nextInt();
			 a++;
		 }
		 System.out.println("恭喜答对了");
		 console.close();
		 
	 }
}
