import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //percabangan if-else
        
            int umur;
            
            System.out.print("masukkan umur anda : ");
            umur = sc.nextInt();

            if (umur >= 18){
                System.out.println("anda dewasa");
            }else{
                System.out.println("anda belum dewasa");
            }
    }
}
