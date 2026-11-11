import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("masukkan angka 1 : ");
            int angka1 = s.nextInt();
            System.out.print("masukkan angka2 : ");
            int angka2 = s.nextInt();

            if (angka1 < 0 || angka2 < 0) {
                System.out.println("angka tidak boleh negatif");
                break;
                
            }else{
                System.out.printf("%d + %d = %d\n",angka1,angka2,angka1 + angka2);
            }
        }
        

    }
}
