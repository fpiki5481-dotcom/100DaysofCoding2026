import java.util.Scanner;

public class day70 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("masukkan angka a : ");
        int a = s.nextInt();
        for (int i = 1; i <= a; i++){
            for (int b = 1; b <= i; b++){
                System.out.print(".");
            }
              System.out.println("");
        }
    }
}
