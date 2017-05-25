import java.util.*;

public class Main29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String str = scanner.nextLine();
			char[] ary = str.toCharArray();
			Arrays.sort(ary);
			System.out.println(ary);
		}
	}

}
