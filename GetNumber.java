package practice;

public class GetNumber {
static String s="32dfsfh8fds0fddf9329k32k";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = s.replaceAll("[^0-9]","");
		String str = "2017-03-02 21:09:09";
		String str2 = "";
		String []result = str.split("\\D");
		System.out.println(a);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]);
			str2+=result[i];
		}
		System.out.println(str2);
	}

}
