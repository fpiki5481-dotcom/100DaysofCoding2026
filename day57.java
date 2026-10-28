import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("input angka negatif : ");
        int n =s.nextInt();
        for(int i = 1; i <= n; i++){
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        
         for(int y = 1; y <= n; y++){
            if (y % 2 != 0) {
                System.out.println(y + " ");
            }
         }
         System.out.println("\n\n");
    }
}
