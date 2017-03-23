package sorting;

public class BubbleSort {

	/**
	 * ц╟ещеепР
	 */
	public static void swap(int []num,int x,int y)
	{
		int temp = num[x];
		num[x] = num[y];
		num[y] = temp;
	}
	public static void bubblesort(int[] num)
	{
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=0;j<num.length-1-i;j++)
			{
				if(num[j]>num[j+1])
				{
					swap(num,j+1,j);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[]{1,23,4,56,32,76,90,10};
		BubbleSort.bubblesort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
