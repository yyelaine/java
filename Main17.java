import java.util.InputMismatchException;
import java.util.Scanner;


public class Main17 {

	private static final int origin = 2;
	/**
	 * ����:�Ȳ����� 2��5��8��11��14...
	 * ����:������N >0
	 * ���:��Ȳ�����ǰN���
	 * ����:ת���ɹ����� 0 ,�Ƿ��������쳣����-1
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
