import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        final int x = 0;
        array(x, y);

    }
    public static void array(int a, int b){
        int[] mainArray = new int[100];
        for(int i = 0; i < 100; i++){
            mainArray[i] = a + (int)(Math.random() * b); //a always 0, b get from Scanner
            //System.out.println(mainArray[i]);
            if(mainArray[i] % 3 == 0 && mainArray[i] > 0){
                System.out.println(mainArray[i]);
            }

            for(i = 0; i < 100; i++)
            isPrime(mainArray[i]);
        }


        }
    public static boolean isPrime(int num){
        if(num <= 2) return false;
        if(num % 2 == 0) return false;
        for(int j = 3; j * j <= num; j += 2)
            if(num % j == 0) return false;
        return true;
    }


    }

