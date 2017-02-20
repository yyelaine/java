package welcome;

public class Inc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inc inc = new Inc();
		int i = 0;
		inc.fermin(i);
		i = i++;
		System.out.println(i);
		

	}
	int fermin (int i ){
		return i++;
	}
}
