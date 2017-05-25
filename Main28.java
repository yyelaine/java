import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String str = scanner.next();
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<str.length()-1;i++){
				for(int j=i+1;j<=str.length();j++){
					String substring = str.substring(i, j);
					if(isMima(substring)){
						list.add(substring.length());
					}
				}
			}
			Collections.sort(list);
			System.out.println(list.get(list.size()-1));
		}
	}

	private static boolean isMima(String substring) {
		// TODO Auto-generated method stub
		if(substring.length()%2!=0)
			return false;
		for(int i=0;i<substring.length()-1;i++){
			if(substring.charAt(i)!=substring.charAt(substring.length()-1-i))
				return false;
		}
		return true;
	}

}
