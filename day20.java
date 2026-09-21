import java.util.Scanner;
public class day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //mengubah tipe data primitif ke non primitif 
        int a = sc.nextInt();
        Boolean b =sc.nextBoolean();
        Double d = sc.nextDouble();


        String A = String.valueOf(a);
        String B = String.valueOf(b); 
        String C = String.valueOf(d); 

        System.out.printf("ini adalah int ke string : %s\n",A);
        System.out.printf("ini adalah boolean ke string : %s\n",B);
        System.out.printf("ini adalah double ke string : %s\n",C);
    }
}
