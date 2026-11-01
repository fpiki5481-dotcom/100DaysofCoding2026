import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("masukkan angka : ");
        int n = s.nextInt();

        int a = 1;

        for(int i = 1; i <= n; i++){
            a *= i;
        }
        System.out.println(a);
    }
}
