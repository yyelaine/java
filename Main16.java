import java.util.Scanner;


public class Main16 {

	/**
	 * 根据输入的日期，计算是这一年的第几天.
	 * 详细描述：输入某年某月某日，判断这一天是这一年的第几天。
	 */
	public static int calculate(int year,int month,int day)
	{
		int sum = 0;
		boolean isLeapYear = false;
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		//判断是否为闰年
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
