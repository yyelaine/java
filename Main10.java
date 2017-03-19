import java.util.Scanner;

public class Main10 {

	/**
	 * 
	 * xcopy /s c:\ d:\，
	 * 参数1：命令字xcopy 
	 * 参数2：字符串/s
	 * 参数3：字符串c:\
	 * 参数4: 字符串d:\
	 * 请编写一个参数解析程序，实现将命令行各个参数解析出来。
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
