import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int waktu = sc.nextInt();

        int jam = waktu / 3600;
        int menit = (waktu % 3600) / 60;
        int detik = waktu % 60;

        if (jam >= 1){
            System.out.println(jam+ " : " + menit + " : " + detik );
        }
        else {
            System.out.println(menit + " : " + detik);
        }
    }
}
