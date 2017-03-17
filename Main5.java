import java.util.Scanner;


public class Main5 {

	/**
	* 计算放苹果方法数目

	* 输入值非法时返回-1
	* 1 <= m,n <= 10
	* @param m 苹果数目
	* @param n 盘子数目数
	* @return 放置方法总数
	*
	*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int times = Main5.count(m, n);
		System.out.print(times);
	}
	public static int count(int m, int n)
	{
		if(m==0||n==1)
			return 1;
		if(n>m)
			return count(m,m);
		else
			return count(m,n-1)+count(m-n,n);
	}

}
