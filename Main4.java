import java.util.Scanner;


public class Main4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringBuilder stringbuilder = new StringBuilder(str);
		stringbuilder.reverse();
		System.out.print(stringbuilder.toString());
	}

}
