package stem;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
		int[] arr={6,3,8,2,9,1};
	��������System.out.println("����ǰ����Ϊ��");
	��������for(int num:arr){
	������������System.out.print(num+" ");
	��������}
	��������for(int i=0;i<arr.length-1;i++){//���ѭ��������������
	������������for(int j=0;j<arr.length-1-i;j++){//�ڲ�ѭ������ÿһ��������ٴ�
	����������������if(arr[j]>arr[j+1]){
	��������������������int temp=arr[j];
	��������������������arr[j]=arr[j+1];
	��������������������arr[j+1]=temp;
	����������������}
	������������}
	��������} 
	��������System.out.println();
	��������System.out.println("����������Ϊ��");
	 ��������for(int num:arr){
	 ������������System.out.print(num+" ");
	 ��������} 

	}
	
	/*public  sort(int[] arr){
		for(int i=0;i<arr.length-1;i++){//���ѭ��������������
		������������for(int j=0;j<arr.length-1-i;j++){//�ڲ�ѭ������ÿһ��������ٴ�
		����������������if(arr[j]>arr[j+1]){
		��������������������int temp=arr[j];
		��������������������arr[j]=arr[j+1];
		��������������������arr[j+1]=temp;
		����������������}
		������������
		��������} 
		}
		int[] array = arr;
		return array;
	}*/

}
