import java.util.Scanner;
public class day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("variabel a  Sebelum dirubah  " + a);
        System.out.println("variabel b  Sebelum dirubah  " + b);
     
       int tukar = a;
        a = b;
        b = tukar;

        System.out.println("variabel a sesudah di ubah " + a);
        System.out.println("variabel b sesudah di ubah " + b);
    }
}
