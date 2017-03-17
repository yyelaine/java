import java.util.Scanner;


public class Main7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//while(scanner.hasNextLine())
		int A = scanner.nextInt();
		int B = scanner.nextInt(); 
		int C = A*B;
		int mingbs = 1;
		for(int i=1;i<=C;i++)
		{
			if(i%A==0&&i%B==0)
			{
				mingbs = i;
				break;
			}
				
		}
		System.out.print(mingbs);
	}

}
