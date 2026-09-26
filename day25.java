import java.util.Scanner;
public class day25 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //menghitung luas lingkaran

       

        System.out.print("masukkan jari jari lingkarang : ");
        int r = sc.nextInt();

        double luas = 3.14 * r * r ;
        System.out.printf("jadi luas lingkarang dengan jari jari %dcm %nadalah : %fcm",r,luas);


    }
}
