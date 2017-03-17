import java.util.Scanner;

public class Main6 {

	/**
	 * @param args
	 */
    public static int findNumberOf1(int num)
        {
        int count = 0;
        String str = Integer.toBinaryString(num);
		//System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='1')
				count=count+1;
		}
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//while(scanner.hasNextLine())
		int num = scanner.nextInt();
		int count = 0;
		count = Main6.findNumberOf1(num);
		System.out.println(count);
	}

}
