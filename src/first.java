import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class first {
    public static void poisk(int number, int[] aboba)
    {
        int low = 0;
        int mm =0;
        int high = aboba.length;
        int middle;

        while(low <= high) {
            middle = (low + high) / 2;
            mm +=1;
            int num = aboba[middle];

            if(num == number){
                System.out.println("Значение найдено под индексом "+middle);
                System.out.println("Количество итераций "+mm);
                return;
            } else if(num > number){
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        System.out.println("Искомого значения в массиве нет");
        System.out.println("Количество итераций "+mm);
    }
    public static void main(String[] args)
    {
        int [] aboba;
        int len;
        int number;
        System.out.println("vvedite dliny");
        Scanner scan = new Scanner(System.in);
        len = scan.nextInt();
        aboba = new int [len];
        Random r = new Random();
        for (int i=0;i<len;i++)
        {
            aboba[i] = r.nextInt(-100,100);
        }

        Arrays.sort(aboba);
        System.out.println(Arrays.toString(aboba));
        System.out.println("Введите число для поиска:");

        number = scan.nextInt();
        poisk(number,aboba);
    }
}
