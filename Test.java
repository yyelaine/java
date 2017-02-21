package practice;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("World");
		char ch[] = {'H','E','L','L','O'};
		change(str,ch);
		System.out.println(str+"and");
		System.out.println(ch);
	}
	public static void change(String str,char ch[])
	{
		str = "change";
		//ch = new char[]{'c','e','l','l','o'};
		ch[0]='C';
	}

}
