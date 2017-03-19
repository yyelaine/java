import java.util.InputMismatchException;
import java.util.Scanner;


public class Main17 {

	private static final int origin = 2;
	/**
	 * 功能:等差数列 2，5，8，11，14...
	 * 输入:正整数N >0
	 * 输出:求等差数列前N项和
	 * 返回:转换成功返回 0 ,非法输入与异常返回-1
	 */
	public static int dengChaShuLie(int num)
	{
		int sum = 0;
		if(num<0)
			sum = -1;
		else
		{
			sum = num*origin + num*(num-1)*3/2;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			try{
				int num = scanner.nextInt();
				System.out.println(dengChaShuLie(num));
			}
			catch(InputMismatchException ex)
			{
				System.out.println(-1);
			}
			
		}

	}

}
