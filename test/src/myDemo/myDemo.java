package myDemo;



public class myDemo {
	public static void main(String[] args){
		long dis=1000*365*24*60*60*299545522;
		System.out.println(dis);
		System.out.println(dis);
		
		int num=18,index;
		System.out.println(index=num%5);
		System.out.println(index);
		int a,b,c;
		a=b=c=100;
		
		
		
		
	}
	public static void print(int size){
		if(size%2==0){
			size++;
		}
		int i;
		int j;
		for(i=0;i<size/2+1;i++){
			for(j=0;j<size/2-i;j++){
				System.out.println(" ");
			}
			for(j=0;j<2*(i+1)-1;j++){
				System.out.println("*");
			}
			System.out.println();
		}
		for(i=0;i<size/2;i++){
			for ( j = 0; j < i+1; j++) {
				System.out.println(" ");
			}
			for (j = 0; j < 2*(size/2-i)-1; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
	}
	
	
}
