import java.util.Scanner;


public class Main13 {

	/**
	 * ���дһ�����������������Ӻ�������
	 * ����n x m�����̸��ӣ�nΪ����ĸ�������mΪ����ĸ�������
	 * ���Ÿ��Ա�Ե�ߴ����Ͻ��ߵ����½ǣ��ܹ��ж������߷���Ҫ�����߻�ͷ·��
	 * ����ֻ�����Һ������ߣ���������������ߡ�
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
