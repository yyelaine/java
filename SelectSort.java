package sorting;

public class SelectSort {

	/**
	 * —°‘Ò≈≈–Ú
	 */
	public static void swap(int []num,int x,int y)
	{
		int temp = num[x];
		num[x] = num[y];
		num[y] = temp;
	}
	public static void selectsort(int[] num)
	{
		for(int i=0;i<num.length;i++)
		{
			int min = i;
			for(int j=i+1;j<num.length;j++)
			{
				if(num[min]>num[j])
					min = j;
			}
			swap(num,min,i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[]{1,23,4,56,32,76,90,10};
		SelectSort.selectsort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
