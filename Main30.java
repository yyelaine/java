import java.util.Scanner;


public class Main30 {

	/**
	 * @param args
	 */
	public static int findNumber(int num)
    {
    int count = 0;
    int max=0;
    String str = Integer.toBinaryString(num);
	for(int i=0;i+1<str.length();i++)
	{
		if(str.charAt(i)=='1'&&str.charAt(i+1)=='1'){
			count=count+1;
			if(count>max)
				max=count;
		}	
		/*else if(str.charAt(i)=='1'&&str.charAt(i+1)=='0'){
			count=count+1;
			if(count>max)
				max=count;
			count=0;
		}*/
		else if(str.charAt(i)=='0')
		{
			count=0;
		}
	}
    return max+1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int num = scanner.nextInt();
			int max = 0;
			if(num==0)
				System.out.println(0);
			max = Main30.findNumber(num);
			System.out.println(max);
		}
	}

}
