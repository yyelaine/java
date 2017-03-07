import java.util.Scanner;
public class Main1 {

	/**
	 * @param args
	 */
	public static int[] countLetters(String str1)
	{	int [] counts = new int [26];
		for(int i =0;i<str1.length();i++)
		{
			if(Character.isLetter(str1.charAt(i)))
				counts[str1.charAt(i)-'A']++;
				
		}
		return counts;
	}
	public static int check(String str1,String str2)
	{
		int num =0;
		int [] count1=new int[26];
		int [] count2=new int[26];
		count1 = Main1.countLetters(str1);
		count2 = Main1.countLetters(str2);
		for(int i=0;i<26;i++)
		{
			if(count1[i]!=count2[i])
				num=0;
				break;
		}
		
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		System.out.println(str1);
		String str2 = in.next();
		System.out.println(str2);
		//while (in.hasNext())
		//{
		//	 str1 = in.next();
		//	 str2 = in.next();
		//}
		if( (str1.length()!=str2.length()) || str1.length()>=50 || str2.length()>=50)
				System.out.print(0);
		else
			System.out.print(Main1.check(str1, str2));
	}

}
