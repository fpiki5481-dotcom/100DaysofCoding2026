import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("=== DAFTAR MENU MAKANAN ===");
        
        System.out.println("1.nasi goreng");
        System.out.println("2.bakso kuah");
        System.out.println("3.bakso kuah");
        System.out.println("4.nasi campur\n");


        System.out.print("pilih menu 1-4 : ");
        int menu = sc.nextInt();


         switch (menu) {
            case 1:
                System.out.println("harga nasi goreng : Rp.15.000");
                break;
            case 2:
                System.out.println("harga bakso kuah : Rp.13.000");
                break;
            case 3:
                System.out.println("harga bakso pangsit : Rp.20.000");
                break;
            case 4:
                System.out.println("harga nasi campur : Rp.25.000");
                break;
            default :
                System.out.println("tidak ad pilihan menu");
         }     
    }
}
