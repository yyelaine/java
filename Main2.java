import java.util.Scanner;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//while(scanner.hasNextLine())
		int num = scanner.nextInt();
		int count = 0;
		String str = Integer.toBinaryString(num);
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='1')
				count=count+1;
		}
		System.out.println(count);
	}

}
