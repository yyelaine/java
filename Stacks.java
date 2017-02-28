package practice;

import java.util.Stack;

public class Stacks {

	/**
	 * @param args
	 */
	static String[] months={"Jan","Feb","Mar","Apr","May","Jue","Jul","Aug","Sep","Oct","Nov","Dec"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stk = new Stack();
		for(int i =0;i<months.length;i++)
		{
			stk.push(months[i]+"");
		}
		System.out.println("stk="+stk);
		stk.addElement("The last line");
		System.out.println("element 5 = "+stk.elementAt(5));
		System.out.println("poping elements:");
		while(!stk.empty())
			System.out.println(stk.pop());
	}

}
