package stem;

import java.util.Arrays;
import java.util.Random;

import org.apache.derby.tools.sysinfo;

public class tableList {
	/*public static void main(String[] args) {
        //i变量用于控制行数
        for (int i = 1; i < 10; i++) {
            //j变量用于控制每行中参与计算的最大数值：与行数相等
            for (int j = 1; j <= i; j++) {
                //设置输出的格式，使用"\t"控制排版对齐
                System.out.print( j + "*" + i + "=" + j*i + "\t");
            }
            //每行输出完毕后，需要换行
            System.out.println();
        }
    }    */
	public static void main(String[] args){
		//创建一个10个长度的数组
		int[] arr=new int[10];
		Random ran = new Random();
		for(int i=0;i<arr.length;i++){
			arr[i]=ran.nextInt(100);
		}
		System.out.println("数组中数据为："+Arrays.toString(arr));
	
		//查询最大值
		int max=arr[0];
		for(int i =0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println("最大值是:"+max);
	
		for(int m=0;m<arr.length-1;m++){
			for(int j=0;j<arr.length-m-1;j++){
				if(arr[j]>arr[j+1]){
					int aa=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=aa;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		int[] array=new int[6];
		System.arraycopy(arr, 0, array, 1, 5);
		System.out.println(Arrays.toString(array));
		int[] aa=Arrays.copyOf(array, array.length+1);
		System.out.println(Arrays.toString(aa));
		
	}
	

	
	
	
	
}
