package stem;

import java.util.Scanner;


public class levelForIf {
	 public static void main (String[] args){
		 Scanner console = new Scanner(System.in);
		 System.out.println("��������²�����֣�1-1000),�˳���0");
		 int score=console.nextInt();
		
		//����һ���������Ϊ�²���
		 int num =(int) (Math.random()*1000)+1;
		 System.out.println("num:"+num);
		 int a=0;
		 while(num!=score){
			 if(num<score){
				 System.out.println("̫����");
			 }else if(num>score){
				 System.out.println("̫С��");
			 }else if(score==0){
				 System.out.println("�˳�");
				 break;
			 }else if(a>6){
				 System.out.println("���ź�");
				 break;
			 }
			 System.out.println("��������²�����֣�1-1000�����˳��밴0");
			 score=console.nextInt();
			 a++;
		 }
		 System.out.println("��ϲ�����");
		 console.close();
		 
	 }
}
