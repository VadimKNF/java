import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;


public class ArrTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int krat = scanner.nextInt();
        int[] randomArr = generateRandom(n);
        int[] kratArr = kratArray(randomArr, krat);
        int[] primeArr = isPrime(randomArr);
        System.out.printf("Изначальный массив из %d чисел: %s\n", n, Arrays.toString(randomArr));
        System.out.printf("Массив чисел, кратных %d: %s\n", krat, Arrays.toString(kratArr));
        System.out.printf("Массив простых чисел: %s", Arrays.toString(primeArr));

    }


    private static int[] generateRandom(int a) {
        int[] myArr = new int[a];
        for (int i = 0; i < a; i++) {
            myArr[i] = (int) (Math.random() * 10); //заполняем массив значениями от 0 до 9
        }
        return myArr;
    }

    private static int[] kratArray(int[] randomArr, int krat) {

        int[] kratArr = new int[randomArr.length];
        int countKrat = 0;
        for (int i : randomArr) {
            if (i % krat == 0 && i != 0) {
                kratArr[countKrat] = i;
                countKrat++;
            }
        }

        int[] result = new int[countKrat];
        for (int i = 0; i < countKrat; i++) {
            result[i] = kratArr[i];
        }
        return result;
    }


    private static boolean checkPrime(int num){
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

    private static int[] isPrime(int[] randomArr){
        int[] primeArr = new int[randomArr.length];
        int countPrime = 0;
        for(int i: randomArr) {
            if(checkPrime(i)){
                primeArr[countPrime] = i;
                countPrime++;
            }
        }
        int[] result = new int[countPrime];
        for(int i = 0; i < countPrime; i++){
            result[i] = primeArr[i];
        }
        return result;
    }

  /*  private static int[] sortArr(int[] array){
        int i = 0;
        for(i = 0; i < array.length; i++){
            if(array[i] > array[i + 1]){
                swap(array[i], array[i + 1]);
            }
        }
        return array;
    }

    private static int[] swap(int a, int b){
        int[] arrSwap = new int[2];
        arrSwap[0] = b;
        arrSwap[1] = a;
        return arrSwap;
    } */

}
