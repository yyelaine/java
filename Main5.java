import java.util.Scanner;


public class Main5 {

	/**
	* 计算放苹果方法数目

	* 输入值非法时返回-1
	* 1 <= m,n <= 10
	* @param m 苹果数目
	* @param n 盘子数目数
	* @return 放置方法总数
	*放苹果分为两种情况，一种是有盘子为空，一种是每个盘子上都有苹果。 令(m,n)表示将m个苹果放入n个盘子中的摆放方法总数。 
	*1.假设有一个盘子为空，则(m,n)问题转化为将m个苹果放在n-1个盘子上，即求得(m,n-1)即可 
	*2.假设所有盘子都装有苹果，则每个盘子上至少有一个苹果，即最多剩下m-n个苹果，问题转化为将m-n个苹果放到n个盘子上 
	*即求(m-n，n) 综上所述：  (m，n)=(m,n-1)+(m-n,n);
	*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
            {
            int m = scanner.nextInt();
		int n = scanner.nextInt();
		int times = Main5.count(m, n);
		System.out.println(times);
        }
		
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
