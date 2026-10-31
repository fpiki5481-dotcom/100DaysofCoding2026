import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
  
        Scanner s = new Scanner(System.in);
        int angka1 = 1;

        System.out.print("masukkan angka : ");
        int angkaN = s.nextInt();
        for(int i = 1; i <= angkaN; i++){
            System.out.printf(" %d + %d = %d \n",angka1, i, (i + angka1));
        }
        

    }
}
