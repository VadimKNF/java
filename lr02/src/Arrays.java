/*import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        final int x = 0;
        array(x, y);

    }
    //метод который генерит и заполняет массив рандомными значениями, а потом выводит все числа кратные 3
    public static void array(int a, int b){
        int[] mainArray = new int[100];
        for(int i = 0; i < 100; i++){
            mainArray[i] = a + (int)(Math.random() * b); //a always 0, b get from Scanner, в любой момент можно переделать под конструкцию без константы
            //System.out.println(mainArray[i]);
            if(mainArray[i] % 3 == 0){
                System.out.println(mainArray[i]);
            }

            for(i = 0; i < 100; i++){
                isPrime(mainArray[i]);
            }

        }


        }
        //метод, который определяет является ли элемент массива простым числом
    public static boolean isPrime(int num){
        if(num <= 2){
            return false;
        }
        if(num % 2 == 0){
            return false;
        }
        for(int j = 3; j * j <= num; j += 2)
            if(num % j == 0){
                return false;
            }
        return true;
    }


    }

*/