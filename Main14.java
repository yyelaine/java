import java.util.Scanner;


public class Main14 {

	/**
	 * 
	 * xcopy /s “C:\program files” “d:\”
	 * 参数1：命令字xcopy 
	 * 参数2：字符串/s
	 * 参数3：字符串c:\
	 * 参数4: 字符串d:\
	 * 请编写一个参数解析程序，实现将命令行各个参数解析出来。
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
