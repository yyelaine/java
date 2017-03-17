import java.util.Scanner;
import java.util.*;


public class Main8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int num = scanner.nextInt();
			//System.out.print(num);
			int [] array = new int[num];
			if(num>1000)
				num=999;
			else
			{
				List<Integer> list = new ArrayList<Integer>();
				for(int i = 0;i<num;i++)
				{
					list.add(i);
				}
				int i =0;
				while(list.size()>1)
				{
					i=(i+2)%list.size();
					list.remove(i);
				}
				System.out.print(list.get(0));
				
			}
			
		}
		
		
	}

}
