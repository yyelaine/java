import java.math.BigInteger;
import java.util.Scanner;

public class Main35 {
	public static String AddLongInteger(String addend, String augend){
		BigInteger num = new BigInteger(addend);
		BigInteger num1 = new BigInteger(augend);
		System.out.println(num.add(num1));
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			String addend = scanner.nextLine();
			String augend = scanner.nextLine();
			AddLongInteger(addend,augend);
		}
	}
}
