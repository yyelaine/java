import java.util.Scanner;


public class Main22 {

	 /**
     * 统计出兔子总数。
     * 
     * @param monthCount 第几个月
     * @return 兔子总数
     */
	public static  int getTotalCount(int monthCount,int num) {

		 int aaa=0;
	        for(int i=num+2;i<=monthCount-1;i++){
	        	aaa++;
	        	aaa=aaa+getTotalCount(monthCount,i);
	        }
	     return aaa;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		while (sc.hasNext()) {
			int month=sc.nextInt();
			System.out.println(getTotalCount(month,0)+1);
		}
	}

}
