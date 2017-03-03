package sorting;

public class BInsertSort {

	/**
	 * @param args
	 */
	public static int binsertsort(int [] array, int num){
		int low=0,mid=0;
		int high=array.length;
		for(int i=0;i<array.length;i++)
		{
			while(low<=high)
			{
				mid=(low+high)/2;
				if(array[mid]<=num)
					low=mid+1;
				else
					high=mid-1;
			}
		}
		return low;
/*		for(int j=high;j>low;j--)
		{
			array[j+1]=array[j];
			
		}
	
*/
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,4,10,23,32,56,76,90,100,151,279};
		int m=BInsertSort.binsertsort(array,111);
		System.out.println(m);
		int [] array1 = new int[array.length+1];
		for(int i=0;i<array1.length;i++)
		{
			array1[i]=0;
		}
		for(int i=0;i<array1.length;i++)
		{
			if(i<m)
				array1[i]=array[i];
			else if(i==m)
				array1[i]=111;
			else
				array1[i]=array[i-1];
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array1[i]+" ");
		}
	}

}
