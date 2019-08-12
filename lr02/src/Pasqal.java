public class Pasqal {
    public static void main(String[] args) {
        triangle(7);
    }
    private static void triangle(int a){
        for(int i = 0; i <= a; i++){
            for(int j = i; j > 0; j--) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
}
