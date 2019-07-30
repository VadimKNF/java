import java.util.Scanner;

public class Counter {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        midCount(a, b, c);
        max(a, b, c);
    }

    public static void midCount(int x, int y, int z){
        System.out.println("Среднее арифметическое: " + (x + y + z) / 3);
    }

    public static void max(int p, int q, int r){
        if(p > q && p > r){
            System.out.println("Наибольшее число: " + p);
        }
        else if(q > p && q > r){
            System.out.println("Наибольшее число: " + q);
        }
        else{
            System.out.println("Наибольшее число: " + r);
        }
    }
}
