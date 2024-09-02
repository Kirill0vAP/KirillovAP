import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class second
{
    public static void main(String[] args){
        int [] a;
        int [] b;
        int len;
        System.out.println("vvedite dliny");
        Scanner scan = new Scanner(System.in);
        len = scan.nextInt();
        a = new int [len];
        b = new int [len];
        Random r = new Random();
        for (int i=0;i<len;i++)
        {
            a[i] = r.nextInt(-100,100);
            b[i] = r.nextInt(-100,100);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        HashMap<Integer, Integer> num = new HashMap<>();
        for (int i=0;i<len;i++)
        {
            num.put(a[i], 1);
        }
        for (int i=0;i<len;i++){
            if (num.containsKey(b[i]) && num.get(b[i]) == 1) {
                System.out.println(b[i]);
                num.put(b[i], 2);
            }
        }
    }
}
