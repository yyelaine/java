import java.util.*;
import java.util.Scanner;

public class Main31 {
	public static List<Integer> getResult(int num){
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<20;i++){
			for(int j=0;j<33;j++){
				for(int k=0;k<100;k=k+3){
					if((15*i+9*j+k)==300 && (i+j+k)==100){
						//System.out.println(i+" "+j+" "+k);
						list.add(i);
						list.add(j);
						list.add(k);
					}
				}
			}
		}
		return list;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int num = scanner.nextInt();
			List<Integer> list = new ArrayList<>();
 			list = Main31.getResult(num);
 			for(int i=0;i<list.size();i++){
 				System.out.print(list.get(i)+" ");
 				if((i+1)%3==0){
 					System.out.println();
 				}
 			}
			
		}
	}

}
