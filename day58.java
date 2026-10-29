import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    
        System.out.print("input angka  : ");
        int n =s.nextInt();
        System.out.println("bilangan genap");
        for(int i = n; i >= 1; i--){
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println("");
        System.out.println("bilangan ganjil");
         for(int b = n; b >= 1; b--){
            if (b % 2 != 0) {
                System.out.println(b + " ");
            }
         }
     

    }
}
