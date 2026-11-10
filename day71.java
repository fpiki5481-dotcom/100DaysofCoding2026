import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("masukkan angka a : ");
        int a = s.nextInt();
        for (int i = 5; i >= a; i--){
            for (int y = 1; y <= i; y++){
                System.out.print(".");
            }
              System.out.println("");
        }
    }
}

