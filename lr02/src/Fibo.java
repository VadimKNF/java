import java.util.Arrays;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(Arrays.toString(generator(x)));

    }

    private static int[] generator(int x) {

            int[] arr = new int[x];
            arr[0] = 0;
            arr[1] = 1;

            for (int i = 2; i < arr.length; i++) {
                    arr[i] = arr[i - 1] + arr[i - 2];

                }

        return arr;
        }


    }

