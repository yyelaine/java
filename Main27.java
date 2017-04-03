import java.util.Scanner;

/**
 * Created by hexi on 17-3-19.
 */
public class Main27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // dp[i]��ʾǰi��������ϵ�����֦������,��ʵ���Ǹ���̨�����Ƶ�
            // Ҳ����˵����ǰ�治��ͬ����ɫ������ļ�֦����������OK�ˣ�
            int[] dp = new int[n + 1];
            dp[0] = 1;
            for (int i = 1; i <= n; i++) {
                int[] cnt = new int[10];
                for (int j = i - 1; j >= 0; j--) {
                    cnt[a[j]]++;
                    if (cnt[a[j]] > 1)
                        break;
                   dp[i] = (dp[i] + dp[j]) % 1000000007;
                }
            }
            System.out.println(dp[n]);
        }
        scanner.close();
    }
}