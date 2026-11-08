import java.util.Scanner;

public class day68 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("masukkan angka a : ");
        int a = s.nextInt();
        for (int i = 1; i <= a; i++){
            for (int b = 1; b <= 15; b++){
                System.out.print("O ");
            }
              System.out.println();
        }
    }
}
