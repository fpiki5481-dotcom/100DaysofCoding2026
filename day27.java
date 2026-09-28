import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = ++a;
        int c = a++;
        int d = --a;
        int e = a--;

        System.out.printf(" incrument prefix :%d%n",b);
        System.out.printf("incrument postfix :%d%n",c);
        System.out.printf("decrement prefix  :%d%n",d);
        System.out.printf("decrement postfix :%d%n",e);
    }
}
