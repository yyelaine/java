import java.util.Scanner;

public class Main10 {

	/**
	 * 
	 * xcopy /s c:\ d:\��
	 * ����1��������xcopy 
	 * ����2���ַ���/s
	 * ����3���ַ���c:\
	 * ����4: �ַ���d:\
	 * ���дһ��������������ʵ�ֽ������и�����������������
	 */    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine())
		{
			String str = scanner.nextLine();
			int count = 0;
			int yhcount = 0;
			String [] array = str.split("\\s+");
			for(String s : array)
			{
				count++;
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)=='\"');
					{
						yhcount++;
						System.out.print(" "+yhcount);yhcount++;
					}
						
				}
				System.out.println(count);
				count = count-(yhcount/2);
			}
			System.out.println(count);
			
		}
		
	}

}
