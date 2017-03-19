import java.util.Scanner;


public class Main13 {

	/**
	 * 请编写一个函数（允许增加子函数），
	 * 计算n x m的棋盘格子（n为横向的格子数，m为竖向的格子数）
	 * 沿着各自边缘线从左上角走到右下角，总共有多少种走法，要求不能走回头路，
	 * 即：只能往右和往下走，不能往左和往上走。
	 */
public  static  int cal(int row ,int column)
     {
		int result = 0;
		if(row==0&&column!=0)
			return 1;
		else if(column==0&&row!=0)
		{
			return 1;
		}
		else if(row>0 && column>0)
		{
			result = cal(row-1,column)+cal(row,column-1);
		}
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int row = scanner.nextInt();
			int column = scanner.nextInt();
			System.out.println(cal(row,column));
		}
		
		
	}
}
