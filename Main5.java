import java.util.Scanner;


public class Main5 {

	/**
	* �����ƻ��������Ŀ

	* ����ֵ�Ƿ�ʱ����-1
	* 1 <= m,n <= 10
	* @param m ƻ����Ŀ
	* @param n ������Ŀ��
	* @return ���÷�������
	*��ƻ����Ϊ���������һ����������Ϊ�գ�һ����ÿ�������϶���ƻ���� ��(m,n)��ʾ��m��ƻ������n�������еİڷŷ��������� 
	*1.������һ������Ϊ�գ���(m,n)����ת��Ϊ��m��ƻ������n-1�������ϣ������(m,n-1)���� 
	*2.�����������Ӷ�װ��ƻ������ÿ��������������һ��ƻ���������ʣ��m-n��ƻ��������ת��Ϊ��m-n��ƻ���ŵ�n�������� 
	*����(m-n��n) ����������  (m��n)=(m,n-1)+(m-n,n);
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
