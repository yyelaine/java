package practice;
import java.util.*;

public class TestRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random1 = new Random(100);
		System.out.println(Math.abs(random1.nextInt()));
		System.out.println(Math.abs(random1.nextInt()));
		System.out.println(random1.nextFloat());
		System.out.println(random1.nextBoolean());
		System.out.println("����Ϊ������Զ�");
		Random random2 = new Random(100);
		System.out.println(random2.nextInt());
		System.out.println(random2.nextInt());
		System.out.println(random2.nextFloat());
		System.out.println(random2.nextBoolean());
		
	}

}
