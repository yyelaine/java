import java.util.Scanner;


public class Main18 {

	/**
	 * ���밴���¹�����мƷ֣������ݲ�ͬ�ĵ÷�Ϊ������а�ȫ�ȼ����֡�
	 */
	public static int Security(String str)
	{
		int score = 0;
		//���볤��
		int length = str.length();
		if(length>=8)
			score+=25;
		else if(length<=7&&length>=5)
			score+=10;
		else
			score+=5;
		//ͳ�����֣���ĸ,���Ÿ���
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
		//�ж���ĸ�ĵ÷�
		if(lowercase==0&&uppercase==0)
			score+=0;
		else if(lowercase==0||uppercase==0)
			score+=10;
		else 
			score+=20;
		//�ж����ֵĵ÷�
		if(number==0)
			score+=0;
		else if(number==1)
			score+=10;
		else
			score+=20;
		//�жϷ��ŵĵ÷�
		if(symbol==0)
			score+=0;
		else if(symbol==1)
			score+=10;
		else
			score+=25;
		//�жϽ����ĵ÷�
		if((lowercase>0||uppercase>0)&&number>0)
			score+=2;
		else if((lowercase>0||uppercase>0)&&number>0&&symbol>0)
			score+=3;
		else
			score+=5;
		//�����ܷ�
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
