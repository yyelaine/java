package practice;

public class Max {

	/**
	 * @param args
	 */
	public static int getMax(int a, int b) {
        // write code here
        return ((a+b+Math.abs(a-b))/2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Max.getMax(7, 3));
	}

}
