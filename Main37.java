import java.util.*;
 
public class Main37 {
 
    public static void main(String[] args) {
         
         
         Scanner input = new Scanner(System.in);
         while (input.hasNext()) { //注意while处理多个case
           String s1 = input.next();
           String s2 = input.next();
           System.out.println(Tp(s1,s2));
         }
 
    }
     
public  static boolean Tp(String s1,String s2) {
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    i++;
                    j++;
                    continue;
                } else if (s1.charAt(i) == '?') {
                    i++;
                    j++;
                    continue;
                } else if (s1.charAt(i) == '*'){
                    if (s1.length() == s2.length()) {
                        i++;
                        j++;
                        continue;
                    } else {
                        j++;
                        continue;
                    }
                } else
                    return false;
        }
          
        if (j < s2.length())
            return false;
        else
            return true;
    }
}

