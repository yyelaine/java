import java.util.HashSet;
import java.util.Scanner;

public class Main34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int num = scanner.nextInt();
			String str = String.valueOf(num);
			StringBuffer stringbuffer = new StringBuffer(str);
			String str1 = (stringbuffer.reverse()).toString();
			char [] ch = str1.toCharArray();
			//System.out.println(ch);
			HashSet<Character> set=new HashSet<Character>();
			StringBuilder str2=new StringBuilder();
			for(int i=0;i<ch.length;i++){
				if(!set.contains(ch[i])){
				set.add(ch[i]);
				str2.append(ch[i]);
				}
				
			}
			System.out.println(Integer.valueOf(str2.toString()));
		}
	}

}
