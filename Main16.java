import java.util.Scanner;


public class Main16 {

	/**
	 * ������������ڣ���������һ��ĵڼ���.
	 * ��ϸ����������ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��졣
	 */
	public static int calculate(int year,int month,int day)
	{
		int sum = 0;
		boolean isLeapYear = false;
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		//�ж��Ƿ�Ϊ����
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			isLeapYear = true;
		}
		for(int i=0;i<month-1;i++)
		{
			if(isLeapYear==true)
				days[1]=29;
			sum=sum+days[i];
		}
		sum=sum+day;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int year = scanner.nextInt();
			int month = scanner.nextInt();
			int day = scanner.nextInt();
			System.out.println(calculate(year,month,day));
		}
	}

}
