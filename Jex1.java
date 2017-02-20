package welcome;
import java.io.*;
import java.lang.*;

public class Jex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i ="123",s;
		s = getStr(i);
		System.out.println(s);

	}

	public static String getStr(String s)
	{
		StringBuffer sb = new StringBuffer();
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
