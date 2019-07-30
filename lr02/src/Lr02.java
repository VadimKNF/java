public class Lr02 {
    public static void main(String[] args){
        int a = 8;
        int b = 5;
        count(a, b);
        incremention(a, b);
        bitUpdate(a, b);

    }

    public static void count(int a, int b){             // метод который выполняет арифметические операции
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a - b);
        System.out.println();
    }

    public static void incremention(int a, int b){        // метод который выполняет операции инкремента и декремента
        System.out.println(a++);
        System.out.println(b++);
        System.out.println(a--);
        System.out.println(b--);
        System.out.println(a+=b);
        System.out.println(b+=a);
        System.out.println();
    }

    public static void bitUpdate(int a, int b){         // метод который выполняет побитовые операции
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(Integer.toBinaryString(~b));
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(a << b);
        System.out.println(b << a);
        System.out.println(a >> b);
        System.out.println(b >> a);


    }

}
