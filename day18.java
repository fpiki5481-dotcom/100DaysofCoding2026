
import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //konversi tipe data kecil ke besar


        byte a = sc.nextByte();
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;

        System.out.printf(" byte                 : %d%n",a);
        System.out.printf(" byte ke short        : %d%n",b);
        System.out.printf(" short ke int         : %d%n",c);
        System.out.printf(" int ke long          : %d%n",d);
        System.out.printf(" long ke float        : %f%n",e);
        System.out.printf(" float ke double      : %f%n",f);

    }
}
