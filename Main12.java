import java.util.Scanner;


public class Main12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//while(scanner.hasNext())
		//{
			String str = scanner.nextLine();
			int length = str.length();
			int times = 0;
			if(length==5)
			{
				if(Integer.parseInt(str)==11111)
					System.out.print(times+1);
				else
					System.out.print(times);
			}
			else 
			{	String[] str1 = str.split("\\n",0);
				String str2 = str1.toString();
				length = str2.length();
				int [] num = new int[5];
				for(int i=0;i<5;i++)
				{
					num[i]=0;
				}//统计福卡的数组初始化
				/*for(int j=0;j<length;j++)
				{
					if((j+5)%5==0)
					{
						for(int k=0;k<5;k++)
						{
							if(str.charAt(j)=='1')
								num[k]++;
						}
							
					}*/
				for(int j =0;j<length;j++)
				{
					if((j+5)%5==0)
					{
						if(str.charAt(j)=='1')
							num[0]++;
					}
					if((j+5)%5==1)
					{
						if(str.charAt(j)=='1')
							num[1]++;
					}	
					if((j+5)%5==2)
					{
						if(str.charAt(j)=='1')
							num[2]++;
					}	
					if((j+5)%5==3)
					{
						if(str.charAt(j)=='1')
							num[3]++;
					}	
					if((j+5)%5==4)
					{
						if(str.charAt(j)=='1')
							num[4]++;
					}
					
				}
				times = num[0];
				for(int k=4;k>=0;k--)
				{  
					//System.out.print(num[k]+" ");
					//System.out.println(times);
					if(num[k]>times)
						times = num[k];
				}
					System.out.print(times);
				
				
				
			}
		}
	}

//}
