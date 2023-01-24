import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrray = new int[10];
        for (int i = 0; i < arrray.length; i++) {
            arrray[i] = random.nextInt(0,100);
        }
        System.out.println(Arrays.toString(arrray));
        System.out.println();
        System.out.println("Min number: "+minNumber(arrray));


    }
    static int minNumber(int[] a){
        Arrays.sort(a);
        return a[0];
    }
    }
