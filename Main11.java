import java.util.Scanner;


public class Main11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine())
		{
			String str = scanner.nextLine();
			//StringBuilder stringbuilder = new StringBuilder(str);
			String str1 = str.toLowerCase();
			System.out.print(str1);
		}
	}

}
