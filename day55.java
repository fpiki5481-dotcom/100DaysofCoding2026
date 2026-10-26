import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //BREAK -> MENGHENTIKAN PROSES PAKSA
        System.out.println("====BREAK====");
        int i;
        for(i = 0; i <= 10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println(i + ". Teks");
        }
        System.out.println("\n");

        //CONTUNIE -> MELEWATI SATU PUTARAN ITERASI
        System.out.println("====CONTINUE====");
        for(i = 0; i <= 10; i++) {
            if (i == 5){
                continue;
            }
            System.out.println(i + ". Teks");
        }
        System.out.println("\n");

        //RETURN -> MENGEMBALIKKAN NILAI
        System.out.println("====RETURN====");
        
        return ;


    }
}
