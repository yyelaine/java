import java.util.Scanner;


public class Main14 {

	/**
	 * 
	 * xcopy /s ��C:\program files�� ��d:\��
	 * ����1��������xcopy 
	 * ����2���ַ���/s
	 * ����3���ַ���c:\
	 * ����4: �ַ���d:\
	 * ���дһ��������������ʵ�ֽ������и�����������������
	 */    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringBuffer sb = new StringBuffer();
		int len = 0;
		int quotaNum = 0;
 		for(int i =0;i<str.length();i++)
 		{
 			if(str.charAt(i) == '\"')
 			{
 				quotaNum++;
 				continue;
 			}
 			if(str.charAt(i) != ' ')
 			{
 				sb.append(str.charAt(i));
 			}
 			else if(quotaNum % 2 == 0)
 			{
 				sb.append('\n');
 				len++;
 			}
 			else
 			{
 				sb.append(' ');
 			}
 		}
		System.out.println(len+1);
		System.out.println(sb.toString());
	}
}
