import java.util.Scanner;

public class Main9 {

	/**
	 * 
	 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
	 * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
	 * 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
	 * 
	 * 给定函数count(int n),用于计算n以内(含n)完全数的个数
	 * @param n 计算范围, 0 < n <= 500000
	 * @return n以内完全数的个数, 异常情况返回-1
	 * 
	 */    
	public static int gys(int n)
	{	int sum = 0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum=sum+i;
				
		}
		return sum;
	}
    public static int count(int n)
        {
        int count = 0;
        if(n<-1||n>500000)
        	return -1;
        for(int i=1;i<=n;i++)
        {
        	int sum = 0;
        	//求n的所有除去自己的约数及约数之和
        	sum = Main9.gys(i);
        	//约数之和是否等于n,若等于，count加一
        	if(sum == i)
        		count=count+1;
        	
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int n = scanner.nextInt();
			int count = 0;
			count = Main9.count(n);
			System.out.println(count);
		}
		
	}

}
