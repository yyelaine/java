package practice;
import java.util.*;

public class StacksVec {

	/**
	 * @param args
	 */
	static String[] months={"Jan","Feb","Mar","Apr","May","Jue","Jul","Aug","Sep","Oct","Nov","Dec"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vq = new Vector();
		for (int i=0;i<months.length;i++)
		{
			vq.addElement(months[i]+"");
		}
		if(vq.isEmpty())
		{
			System.out.println("kong");
		}
		while (!vq.isEmpty())
		{
			System.out.println(vq.firstElement());
			vq.removeElement(vq.firstElement());
		}
		vq.clear();
	}

}
