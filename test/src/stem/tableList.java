package stem;

import java.util.Arrays;
import java.util.Random;

import org.apache.derby.tools.sysinfo;

public class tableList {
	/*public static void main(String[] args) {
        //i�������ڿ�������
        for (int i = 1; i < 10; i++) {
            //j�������ڿ���ÿ���в������������ֵ�����������
            for (int j = 1; j <= i; j++) {
                //��������ĸ�ʽ��ʹ��"\t"�����Ű����
                System.out.print( j + "*" + i + "=" + j*i + "\t");
            }
            //ÿ�������Ϻ���Ҫ����
            System.out.println();
        }
    }    */
	public static void main(String[] args){
		//����һ��10�����ȵ�����
		int[] arr=new int[10];
		Random ran = new Random();
		for(int i=0;i<arr.length;i++){
			arr[i]=ran.nextInt(100);
		}
		System.out.println("����������Ϊ��"+Arrays.toString(arr));
	
		//��ѯ���ֵ
		int max=arr[0];
		for(int i =0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println("���ֵ��:"+max);
	
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
