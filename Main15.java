import java.util.Scanner;


public class Main15 {

	/**
	 * ���дһ�����������������Ӻ�������
	 * ����n x m�����̸��ӣ�nΪ����ĸ�������mΪ����ĸ�������
	 * ���Ÿ��Ա�Ե�ߴ����Ͻ��ߵ����½ǣ��ܹ��ж������߷���Ҫ�����߻�ͷ·��
	 * ����ֻ�����Һ������ߣ���������������ߡ�
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
