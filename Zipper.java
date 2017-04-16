import java.util.Scanner;

public class Zipper1 {

	/**
	 * @param 字符串压缩
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringBuilder stringbuilder = new StringBuilder();
		int index = 1;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (i == str.length() - 1) {
				stringbuilder.append(str.charAt(i));
				stringbuilder.append(index);
			} else if (str.charAt(i + 1) == str.charAt(i)) {
				index++;
				// System.out.println(index);
			} else {
				stringbuilder.append(str.charAt(i));
				stringbuilder.append(index);
				// System.out.println(index);
				index = 1;
			}
		}

		if (stringbuilder.length() > str.length())
			System.out.println(str);
		else
			System.out.println(stringbuilder.toString());
	}

}
