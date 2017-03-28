import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main25 {

	/**
	 * @param args
	 */
	public static List<Integer> Cancle(int[] array)
	{
		//System.out.print("已调用");
		List<Integer> list = new ArrayList<Integer>();
		for(int i = array.length-1;i>=0;i--)
		{
			if(!list.contains(array[i]))
			{
				list.add(array[i]);
			}
				
		}
		return list;
		/*int listnum = list.size();
		System.out.print("list大小为"+listnum);
		System.out.print(list.get(0));
		System.out.print(list.get(1));
		for(int j=listnum-1;j<=0;j++)
		{
			System.out.print(list.get(j)+" ");
		}*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			int num = scanner.nextInt();
			if (num >= 1 && num <= 50) {
				List<Integer> list1 = new ArrayList<Integer>();

				int[] array = new int[num];
				for (int i = 0; i < num; i++) {
					array[i] = scanner.nextInt();
				}

				list1 = Cancle(array);
				int listnum = list1.size();

				int[] array1 = new int[listnum];

				for (int k = listnum - 1; k >= 0; k--) {
					if (k == 0)
						System.out.print(list1.get(k));
					else
						System.out.print(list1.get(k) + " ");
				}
			}

		}
	}


}
