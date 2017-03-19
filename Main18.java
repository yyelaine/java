import java.util.Scanner;


public class Main18 {

	/**
	 * 密码按如下规则进行计分，并根据不同的得分为密码进行安全等级划分。
	 */
	public static int Security(String str)
	{
		int score = 0;
		//密码长度
		int length = str.length();
		if(length>=8)
			score+=25;
		else if(length<=7&&length>=5)
			score+=10;
		else
			score+=5;
		//统计数字，字母,符号个数
		int number = 0;
		int lowercase = 0;
		int uppercase = 0;
		int symbol = 0;
		for(int i=0;i<length;i++)
		{
			if(str.charAt(i)>='a'&&str.charAt(i)<='z')
				lowercase++;
			else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
				uppercase++;
			else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
				number++;
			else
				symbol++;
		}
		//判断字母的得分
		if(lowercase==0&&uppercase==0)
			score+=0;
		else if(lowercase==0||uppercase==0)
			score+=10;
		else 
			score+=20;
		//判断数字的得分
		if(number==0)
			score+=0;
		else if(number==1)
			score+=10;
		else
			score+=20;
		//判断符号的得分
		if(symbol==0)
			score+=0;
		else if(symbol==1)
			score+=10;
		else
			score+=25;
		//判断奖励的得分
		if((lowercase>0||uppercase>0)&&number>0)
			score+=2;
		else if((lowercase>0||uppercase>0)&&number>0&&symbol>0)
			score+=3;
		else
			score+=5;
		//返回总分
		return score;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine())
		{
			String str = scanner.nextLine();
			int score = Security(str);
			if(score>=90)
				System.out.println("VERY_SECURE");
			else if(score>=80)
				System.out.println("SECURE");
			else if(score>=70)
				System.out.println("VERY_STRONG");
			else if(score>=60)
				System.out.println("STRONG");
			else if(score>=50)
				System.out.println("AVERAGE");
			else if(score>=25)
				System.out.println("WEAK");
			else
				System.out.println("VERY_WEAK");
		}
	}

}
