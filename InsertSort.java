package practice;
import org.rut.util.algorithm.SortUtil;

public class InsertSort implements SortUtil.sort{

	/**
	 * @param args
	 */
	public void sort(int[] data) {
		// TODO Auto-generated method stub
		int temp;
		for(int i = 1;i<data.length;i++)
			for(int j = i;(j>0)&&(data[j]<data[j-1]);j--)
			{
				SortUtil.swap(data,j,j-1);
			}

	}

}
