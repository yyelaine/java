import java.util.Scanner;


public class Main19 {

	/**
	 * �ҳ������ַ����д�д�ַ�(��'A'-'Z')�ĸ����ӿ�˵��
	 */
	public static int CalcCapital(String str)
	{
		int number = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)<='Z'&&str.charAt(i)>='A')
				number++;
		}
		
		return number;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine())
		{
			String str = scanner.nextLine();
            System.out.println(CalcCapital(str));
			//int score = GetPwdSecurityLevel(str);
			
		}
	}

}
