package practice;

public class FibonaciIteration {

	/**
	 * @param args
	 */
	public static int fibonacciiteration(int n) {
        // write your code here
		int temp=0,prior=1,pronext=1;
		if(n<0)
			return 0;
        if(n==0)
        	return 0;
        if(n==1||n==2)
        	return 1;
        for(int i=2;i<n;i++)
        {
        	temp=prior+pronext;
        	prior=pronext;
        	pronext=temp;
        }
        return temp;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(fibonacciiteration(9));
	}

}
