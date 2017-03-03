package sorting;

public class InsertSort {

	/**
	 * @param args
	 */
	public static void insertsort(int[] array){
		for(int i=1;i<array.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(array[j]<array[j-1])
				{
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,23,4,56,32,76,90,10};
		InsertSort.insertsort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
