import java.util.Scanner;


public class Main21 {

	/**
	 * ����: ��֤��Ƴ�˹���������κ�һ������m������������д��m����������֮�͡�
	 * ԭ�ͣ�int GetSequeOddNum(int m,char * pcSequeOddNum);
	 * ���������int m������(ȡֵ��Χ��1��100)
	 * ����ֵ��m����������(��ʽ����7+9+11��);
	 */
	public static String GetSequeOddNum(int m)
	{
		StringBuilder stringbuilder = new StringBuilder();
		int cubicNumber = (int) Math.pow(m, 3);
		int temp = 0;
		for(int i=1;i<cubicNumber;i=i+2)
		{
			temp = temp + i;
			if(temp>cubicNumber)
				break;
			if(temp==cubicNumber)
			{
				for(int j=1;j<=i;j=j+2)
				{
					stringbuilder.append(j+"+");
				}
				
			}
		}
		return stringbuilder.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int num = scanner.nextInt();
			String str = Main21.GetSequeOddNum(num);
			System.out.println(str);
		}
	}

}
