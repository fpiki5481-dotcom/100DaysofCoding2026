import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //percabangan if-else-if-else
        
            int umur = sc.nextInt();

            if (umur >= 18){
                System.out.println("anda dewasa");
            }else if (umur >= 10 && umur <= 18){
                System.out.println("anda masih bocil");
            }else{
                System.out.println("dasar bocah");
            }
    }
}
