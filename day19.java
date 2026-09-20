import java.util.Scanner;

public class day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //mengonfersi otomatis dari tipe data terkecil kebesar


        long l = sc.nextLong();
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        System.out.printf(" Long          : %d%n",l);
        System.out.printf(" Long ke int   : %d%n",i);
        System.out.printf(" Int ke short  : %d%n",s);
        System.out.printf(" short ke byte : %d%n",b);

    }
}
