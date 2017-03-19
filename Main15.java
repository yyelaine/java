import java.util.Scanner;


public class Main15 {

	/**
	 * 请编写一个函数（允许增加子函数），
	 * 计算n x m的棋盘格子（n为横向的格子数，m为竖向的格子数）
	 * 沿着各自边缘线从左上角走到右下角，总共有多少种走法，要求不能走回头路，
	 * 即：只能往右和往下走，不能往左和往上走。
	 */
	public static int factorial(int m)
	{
		int sum = 1;
		for(int i=1;i<=m;i++)
		{
			sum *= i; 
		}
		return sum;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int all = factorial(m+n);
			int right = (factorial(m)*factorial(n));
			//int result = all/right;
			System.out.println(all/right);
		}
		
	}

}
