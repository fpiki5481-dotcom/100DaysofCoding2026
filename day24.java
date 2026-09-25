import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        
        Scanner ab = new Scanner(System.in);
      
      int panjang,lebar,hasil;

      System.out.print("massukkan panjang : ");
      panjang = ab.nextInt();
      System.out.print("masukkan lebar: ");
      lebar = ab.nextInt();
      
      hasil = panjang * lebar;

      System.out.println("luas persegi panjang adalah: " + hasil);


    }
}
