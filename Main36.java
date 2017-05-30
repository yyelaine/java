import java.util.Scanner;

public class Main36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			//String str = scanner.nextLine();
			//String str2 = "7";
			int num = scanner.nextInt();
			int count = 0;
			
			for(int i=1;i<=num;i++){
				String str = String.valueOf(i);
				if(i%7==0 ||str.contains("7")){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
