import java.util.Scanner;


public class Main21 {

	/**
	 * 功能: 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
	 * 原型：int GetSequeOddNum(int m,char * pcSequeOddNum);
	 * 输入参数：int m：整数(取值范围：1～100)
	 * 返回值：m个连续奇数(格式：“7+9+11”);
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
