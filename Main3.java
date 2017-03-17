import java.util.Scanner;


public class Main3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//while(scanner.hasNextLine())
		//float num = scanner.nextFloat();
		//if(num<0)
			 //num = scanner.nextFloat();
		int value =0;
		String str1 = scanner.nextLine();
		//System.out.print(str1+" ");
		//String str = String.valueOf(num);
		String[] split = str1.split("\\.",0);
		//for(int i =0;i<split.length;i++)
			//System.out.print(split[i]+" ");
		String value2 = split[1].substring(0,1);
			if(Integer.parseInt(value2)>=5)
			{
				value = Integer.parseInt(split[0])+1;
				System.out.print(value);
			}
			else
			{
				value = Integer.parseInt(split[0]);
				System.out.print(value);		
			}
				
	}

}
